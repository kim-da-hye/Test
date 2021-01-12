package java8_project;

import java.util.Scanner;

abstract class Converter {// 추상 슈퍼 클래스 Converter 선언
    abstract protected double convert(double src); //추상메소드
    abstract protected String srcString();
    abstract protected String destString();
    protected double ratio; //비율

    public void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(srcString() + "을 " + destString() + "로 바꿉니다."); //출력
        System.out.print(srcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + destString() + "입니다");
        scanner.close();
    }
}


class Km2Mile extends Converter { //서브클래스와 선언과 상속
    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String srcString() {
        return "km";
    }

    @Override
    protected String destString() {
        return "mile";
    }

    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km 인수가 있는 객체 선언
        toMile.run();
    }
}
