import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaGenerics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Object> objectList = new ArrayList<>();
        while (sc.hasNext()){
            Object object = sc.nextLine();
            objectList.add(object);
        }
        printArray(objectList);
    }

    public static void printArray(List<Object> array){
        for(Object obj:array) {
            System.out.println(obj);
        }
    }
}
