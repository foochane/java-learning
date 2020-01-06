package cn.chane.api;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo {
    public static void main(String[] args) {

        File file = new File("E:\\code");
        getAllFiles(file);

    }

    public static void  getAllFiles( File file){

        //1 直接重载accept方法
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });

        // 2 使用lambda表达式
//        File[] files = file.listFiles((File pathname)->{
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
//            }
//        );

        // 3 lambda表达式简化
//        File[] files = file.listFiles((File pathname)->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));

        // 4 lambda表达式进一步简化
//        File[] files = file.listFiles((pathname)->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));



        // 1 直接重载accept方法
//        File[] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });

        // 2 使用lambda表达式
        File[] files = file.listFiles((dir, name) -> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for(File f :files){
            if(f.isDirectory()){
                getAllFiles(f);
            }else {
                System.out.println(f.toString());
            }

        }

    }
}
