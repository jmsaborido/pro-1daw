package model;

import java.io.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Person> people;

    private Connection con;

    public Database() {
        people = new LinkedList<Person>();
    }

    public void connect() throws Exception {

        if (con != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = "jdbc:mysql://51.75.248.163:3306/T246?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        con = DriverManager.getConnection(url, "T246", "T246fabercastell%");
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }
    }

    public void insert() throws SQLException {



        String insertSql = "insert into people (id, name, age, employment_status, tax_id, us_citizen, gender, occupation) values (?, ?, ?, ?, ?, ?, ?, ?)";
        Statement selectStatement = con.createStatement();

        selectStatement.executeUpdate(insertSql);


    }

    public void select() throws SQLException {
        people.clear();

        String sql = "select id, name, age, employment_status, tax_id, us_citizen, gender, occupation from people order by id";
        Statement selectStatement = con.createStatement();

        ResultSet results = selectStatement.executeQuery(sql);

        while (results.next()) {
            int id = results.getInt("id");
            String name = results.getString("name");
            String age = results.getString("age");
            String emp = results.getString("employment_status");
            String taxId = results.getString("tax_id");
            boolean isUs = results.getBoolean("us_citizen");
            String gender = results.getString("gender");
            String occ = results.getString("occupation");

            Person person = new Person(id, name, occ, AgeCategory.valueOf(age), EmploymentCategory.valueOf(emp), taxId, isUs, Gender.valueOf(gender));
            people.add(person);
        }

        results.close();
        selectStatement.close();
    }

    public void update(int a) throws SQLException{
        String sql = "update name, age, employment_status, tax_id, us_citizen, gender, occupation from people where id="+ a;
        Statement selectStatement = con.createStatement();

        selectStatement.executeUpdate(sql);


        selectStatement.close();


    }

    public void delete (int a) throws SQLException{
        String sql ="delete from people where id <"+ a;
        Statement selectStatement = con.createStatement();

        selectStatement.executeUpdate(sql);

        people.clear();


        selectStatement.close();

    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(int index) {
        people.remove(index);
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(people);
    }

    public void saveToFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Person[] persons = people.toArray(new Person[people.size()]);

        oos.writeObject(persons);

        oos.close();
    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            Person[] persons = (Person[]) ois.readObject();

            people.clear();

            people.addAll(Arrays.asList(persons));

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        ois.close();
    }
}
