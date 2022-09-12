public class Main {
    public static void main(String[] args) {

        //Task 1
        String firstName = "  Ivan ";
        String middleName = " Ivanovich ";
        String  lastName = " Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println( "ФИО сотрудника — " + fullName );

        //Task 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName1);

        //Task 3
        String fullName2 = " Иванов Семён Семёнович ";
        fullName2 = fullName2.replace('ё', 'е' );
        fullName2 = fullName2.replace('Ё', 'Е' );
        System.out.println("Данные ФИО сотрудника —" + fullName2);








    }
}