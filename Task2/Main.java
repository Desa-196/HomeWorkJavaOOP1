package Task2;

public class Main {
    public static void main(String[] args){
        //Пустой конструктор
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Прямоугольник 1");
        System.out.printf("Ширина = %.1f Высота = %.1f \n", rectangle1.getWidth(), rectangle1.getHeight());
        System.out.printf("Площадь = %.1f Периметр = %.1f \n", rectangle1.calculateArea(), rectangle1.calculatePerimeter());

        //Передача в контруктор высоты и ширины
        Rectangle rectangle2 = new Rectangle(15.5, 12);
        System.out.println("Прямоугольник 2");
        System.out.printf("Ширина = %.1f Высота = %.1f \n", rectangle2.getWidth(), rectangle2.getHeight());
        System.out.printf("Площадь = %.1f Периметр = %.1f \n", rectangle2.calculateArea(), rectangle1.calculatePerimeter());

    }
}
