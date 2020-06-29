package polymorphism;

class Pegawai {

    public String nama;
    private final int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {

        return gaji;
    }
}
