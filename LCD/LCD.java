package LCD;

public class LCD {
    // mendeklarasikan atribut-atribut pada LCD
    private String Status; // status LCD (ON, OFF, FREEZE)
    private int Volume; // Volume (0-100)
    private int Brightness; // Brightness (0-100)
    private String Cable; // jenis kabel (HDMI, VGA, DVI. dan DisplayPort)

    //Konstruktor untuk nilai awal
    public LCD() {
        this.Status = "Off"; //Set status awal ke OFF
        this.Volume = 0; // set Volume awal ke 0
        this.Brightness = 50; // set brightness awal ke 50
        this.Cable = "HDMI"; // set jenis kabel awal ke HDMI
    }

    // mengubah status LCD menjadi ON
    public void turnOn() {
        this.Status = "On";
    }

    // mengubah status LCD menjadi OFF
    public void turnOff() {
        this.Status = "Off";
    }

    // mengubah status menjadi FREEZE 
    public void Freeze() {
        this.Status = "Freeze";
    }

    // method untuk mangatur volume 
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) { // memeriksa apakah volume valid
            this.Volume = volume; // set volume baru
        } else {
            System.out.println("tingkat volume tidak valid!"); // output apabila volume tidak valis
        } 
    }

    // mengubah volume menjadi besar
    public int volumeUp() {
        if (this.Volume < 100) { // memeriksa apakah volume kurang dar 100
            this.Volume++; // menambah volume 1
        }
        return this.Volume; // mengembalikan volume yang baru diubah 
    }

    // method untuk mengatur brightness
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) { // memeriksa apakah brightness valid
            this.Brightness = brightness; // set brightness baru
        } else {
            System.out.println("tingkat brghtness tidak valid!"); // output apabila brightness tidak valid
        }
    }

    // mengurangi brightness 1
    public int brightnessDown() {
        if (this.Brightness > 0) { // memeriksa apakah brightness lebih besar dari 0
            this.Brightness--; // mengurangi brightness 1
        }
        return this.Brightness; // mengembalikan brightness yang baru diubah 
    }

    // method untuk mengatur jenis kabel
    public void setCable(int option) {
        String[] cables = {"HDMI", "VGA", "DVI", "DisplayPort"}; //array unutk menyimpan jenis kabel 
        if (option >= 0 && option < cables.length) { // memeriksa apakah kabel valid
            this.Cable = cables[option]; //set jenis kabel berdasarkan opsi yang dipilih
        } else {
            System.out.println("opsi kabel tidak valid!"); //output jika opsi kabel tidak valid
        }
    }

    // method untuk menampilkan output
    public void displayMessage() {
        System.out.println("LCD Status: " + this.Status); // menceta status LCD
        System.out.println("Volume: " + this.Volume); // mencetak volume
        System.out.println("Brightness: " + this.Brightness); // mencetakk brightness
        System.out.println("Cable: " + this.Cable); // mencetak jenis kabel
    }
}
