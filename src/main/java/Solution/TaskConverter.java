package Solution;

public class TaskConverter {
    public static String converter(String value) {
        String convertedValue = "";
        if (value != null) {
            char[] charValues = value.toCharArray();                                                //Разбил на массив символов
            for (int i = 0; i < charValues.length; i++) {                                           // В цикле в каждой итерации добавляется символ в строку
                if (charValues.length > 4) {                                                        //Условие, если элементов больше 5, то выполняем действие:
                    for (int j = 0; j < charValues.length - 4; j++) {                               //От длины массива отнимаем 4
                        charValues[j] = '#';                                                        // и получаем количество символов, которое нужно заменить на '#'
                    }
                }
                convertedValue = convertedValue + charValues[i];                                    //Добавляем в строку по символу
            }
        }
        else System.out.println("Please enter correct value");                                      //Если null
        return convertedValue;
    }
}