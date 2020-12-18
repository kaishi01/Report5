package jp.ac.uryukyu.ie.e205746.app;

class Report5 {
    String str = null;
    int num = str.length();

    void Print(){
        System.out.println(num);
    }
}

class Main {
    public static void main(String[] args){
        Report5 report5 = new Report5();

        report5.Print();
    }
}