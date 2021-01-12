package java8_project;
public class TV { //����Ŭ���� TV����
    private int size;

    public TV(int size) { //�μ��� �ִ� �޼ҵ� ����
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
 }


 class ColorTV extends TV { //���� Ŭ���� ����
    public int color;

    public ColorTV(int size, int color) { //������ �޼ҵ� ����
        super(size);//���� Ŭ������ �����ڸ� ȣ��
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() + "��ġ " + color + "�÷�"); //���
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024); //�μ��� �ִ� ��ü ����
        myTV.printProperty();
    }
 }


 class IPTV extends ColorTV { //���� Ŭ���� IPTV����
    String address;

    public IPTV(String address, int size, int color) { //������ �޼ҵ� ����
        super(size, color); //���� Ŭ������ �����ڸ� ȣ��
        this.address = address; 
    }

    public void printProperty() {
    	
        System.out.println("���� IPTV�� " + address + " �ּ��� " + getSize() + "��ġ " + color + "�÷�"); //���
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //192.1.1.2 �ּ��� 32��ġ 2048�÷�
        iptv.printProperty();
    }
 }

 
 