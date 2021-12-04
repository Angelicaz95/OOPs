package com.company.class23;

public abstract  class File {

   abstract  void open();
    public void edit (){
        System.out.println("Edit the file");
    }
    public void close(){
        System.out.println("Close the file");
    }

}
class JavaFile extends File{
    @Override
    void open(){
        System.out.println("You need notepad++ or sumblime text");
    }
}
 class WordFile extends File{
    @Override
    void open(){
        System.out.println("You need to install Microsoft Word");
    }
}
class PdfFile extends File{
    @Override
    void open(){
        System.out.println("You can open file with Adobe Reader");

    }
}
class FileTester{
    public static void main(String[] args) {
        File[] files={new JavaFile(), new WordFile(), new PdfFile()};
        for(File f:files){
            f.open();
            f.edit();
            f.close();
        }
    }
}