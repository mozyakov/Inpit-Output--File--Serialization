import java.io.File;

public class Main {
    public static void main(String[] args) {
        //File dir1 = new File("C://SomeDir");  // создаем объект File в качестве каталога
        //File file1 = new File("C://SomeDir", "Hello.txt"); // создаем объект File для файла, находящегося в каталоге
        //File file2 = new File(dir1, "Hello2.txt"); // создаем объект File для файла, находящегося в каталоге dir1

        File dir = new File("Somedir"); // определяем объект для каталога
        if(dir.mkdir())    // создать каталог
            System.out.println("Каталог создан");
        File newDir = new File("newDir)"); // определяем новый объект для каталога
        dir.renameTo(newDir);   // переименовать каталог
        if(newDir.delete())
           System.out.println("Каталог удален");
    }
}