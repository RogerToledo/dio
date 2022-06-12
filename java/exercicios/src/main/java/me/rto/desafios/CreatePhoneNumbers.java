package me.rto.desafios;

public class CreatePhoneNumbers {
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(creatPhoneNumberUsingFormat(numbers));
        System.out.println("------------------------------");
        System.out.println(createPhoneNumber(numbers));

    }

    public static String creatPhoneNumberUsingFormat(int numbers[]){

       return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
               numbers[0], numbers[1], numbers[2],
               numbers[3], numbers[4], numbers[5],
               numbers[6], numbers[7], numbers[8], numbers[9]);
    }
    public static String createPhoneNumber(int numbers[]) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(count < numbers.length) {

            stringBuilder.append("(");

            for (int i = count; i < 3; i++) {
                stringBuilder.append(numbers[i]);

                count++;
            }

            stringBuilder.append(") ");

            for (int i = count; i < 6; i++) {
                stringBuilder.append(numbers[i]);

                count++;
            }

            stringBuilder.append("-");

            for (int i = count; i < numbers.length; i++) {
                stringBuilder.append(numbers[i]);

                count++;
            }
        }

        return stringBuilder.toString();
    }
}
