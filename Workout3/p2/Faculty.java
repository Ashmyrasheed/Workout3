package p2;

public class Faculty {
    int fid;
    String subject;

    Faculty(){

    }
    public Faculty(int fid,String subject){
        this.fid = fid;
        this.subject = subject;
    }

    public void display(){
        System.out.println("Package2");
        System.out.println("Faculty ID : " +fid);
        System.out.println("Subject : " +subject);
        System.out.println("-----------------------------------------");
    }
}