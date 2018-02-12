/*
Рисуем треугольник
Используя цикл for вывести на экран 
прямоугольный треугольник из восьмёрок со сторонами 10 и 10. 
 */
package lab2;
public class RisTreug {
    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            for (int j=0; j<i; j++){
                System.out.print(8);
            }
            System.out.println();
        } 
    }   
}
