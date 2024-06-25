package pack3;

import java.io.File;
import java.io.FileFilter;

public class Prog5 {
    public static void main(String[] args) {
        new File(".")
                .listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.isHidden();
                    }
                });

        // java 8
        new File(".")
                .listFiles(File::isHidden);
    }
}
