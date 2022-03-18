/*
 * Stuka Blyat
 * Nama : Yanuar Tri Laksono
 * NIM  : E41210753
 * Program Studi : Teknik Informatika
 * Mata Kuliah : Workshop Sistem Informasi Berbasis Desktop
 */

package w05.awtlearn; // nama package
import java.applet.Applet; //mengimport class Applet
import java.applet.AppletContext; // mengimport class AppletContext
import java.awt.*; //mengimport semua class yang ada di dalam library awt
public class DrawShapes extends Applet { // class DrawShape merupakan sub class dari class Applet
    Font font; //Deklarasi Object Font berasal dari instance class Font
    Color redColor,blueColor,backgroundColor; //Deklarasi Object redColor , blueColor dan background Color dari instance class Color

    @Override
    public void init(){ //mengoverride method init yang ada pada class Applet
        super.init(); // memanggil method super class
        font = new Font("Arial",Font.ITALIC,18); // inisialisasi object font ,parameter pertama digunakan untuk  Nama Font , parameter kedua digunakan untuk Style font dan parameter ketiga digunakan untuk memberikan ukuran font
        redColor = Color.RED; //Memanggil attribute static didalam class Color lalu mengassigment kedalam variable object redColor
        backgroundColor = Color.orange; // memanggil attribute static orange didlam class Color lalu mengassigment kedalam variable object backgroundColor
        blueColor = new Color(0,0,122); // menginisialisasi object blueColor dengan perintah new kemudian mengisi parameter constructor class Color(R,G,B)
        setBackground(backgroundColor); // method tersebut digunakan untuk mengatur background color
    } //end bracket method ovveride from class Applet init()
    public void stop(){ //method stop
    } // end bracket method stop()
    public void paint(Graphics graph) { // method paint digunakan untuk menggambarkan shape pada frame
        graph.setFont(font); // method setFont digunakan untuk memilih font
        graph.drawString("Draw Shapes",20,20); // method ini digunakan untuk menampilkan teks "Draw Shapes" pada frame dengan posisi x:20 dan y:20
        graph.setColor(blueColor); // method setColor digunakan untuk mengatur warna menjadi biru
        graph.drawRect(120,120,120,120); //method draw rect digunakan untuk membuat persegi parameter pertama adalah posisi x rect , parameter kedua adalah posisi y rect ,parameter ketiga adalah panjang dari rectangle dan  parameter keempat adalah tinggi rect
        graph.fillRect(115,115,90,90); // method ini digunakan untuk mengisi area pada rectangle parameter pertam digunakan untuk mengatur posisi x area yang akan di isi , parameter y digunakan untuk mengisi area yang akan di isi , sedangkan parameter ketiga digunakan untuk mengatur panjang area yang akan di isi dan parameter keempat digunakan untuk mengatur tinggi area yang akan di isi
        graph.setColor(Color.CYAN); // method setColor digunakan untuk mengatur warna rectangle
        graph.drawRect(50,50,50,50);//method draw rect digunakan untuk membuat persegi parameter pertama adalah posisi x rect , parameter kedua adalah posisi y rect ,parameter ketiga adalah panjang dari rectangle dan  parameter keempat adalah tinggi rect
        graph.fillRect(50,50,60,60); // method ini digunakan untuk mengisi area pada rectangle parameter pertam digunakan untuk mengatur posisi x area yang akan di isi , parameter y digunakan untuk mengisi area yang akan di isi , sedangkan parameter ketiga digunakan untuk mengatur panjang area yang akan di isi dan parameter keempat digunakan untuk mengatur tinggi area yang akan di isi

    } // end bracket method paint(Graphic graph)
} // end bracket class DrawShape

