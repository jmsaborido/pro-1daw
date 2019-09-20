public class Main {

    public static void main(String[] args) {
//        System.out.println(esVocalIf('g'));
//        System.out.println(esVocalSwitch('a'));
        System.out.println(esVocalAlt('a'));
    }

    public static boolean esVocalIf(char vocal) {
        Boolean esVocal;
        if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' ||
                vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u')
            esVocal = true;
        else
            esVocal = false;
        return esVocal;

    }

    public static boolean esVocalSwitch(char vocal) {
        Boolean esVocal;
        switch (vocal) {
            case 'A':
                esVocal = true;
                break;
            case 'a':
                esVocal = true;
                break;
            case 'E':
                esVocal = true;
                break;
            case 'e':
                esVocal = true;
                break;
            case 'I':
                esVocal = true;
                break;
            case 'i':
                esVocal = true;
                break;
            case 'O':
                esVocal = true;
                break;
            case 'o':
                esVocal = true;
                break;
            case 'U':
                esVocal = true;
                break;
            case 'u':
                esVocal = true;
                break;
            default:
                esVocal = false;
                break;
        }
        return esVocal;
    }

    public static boolean esVocalAlt(char vocal) {
        return (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' || vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u');
    }

}
