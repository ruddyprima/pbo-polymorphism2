package polymorphism.ID;


public class ID {
    public String nama = "Denny";
    private int nip = 1500631011;
    public String jabatan = "Kepala Sekolah";

    public void nama(){
        System.out.println("Nama : "+nama);
    }

    public void nip(){
        System.out.println("Nip : "+nip);
    }

    public void jabatan(){
        System.out.println("Jabatan : "+jabatan);
    }
}