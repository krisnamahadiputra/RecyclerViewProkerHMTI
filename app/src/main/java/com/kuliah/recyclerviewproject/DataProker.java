package com.kuliah.recyclerviewproject;

import java.util.ArrayList;

public class DataProker {
    private static String [] namaProker = {
            "Pelatihan PKM TI",
            "Bakti Sosial TI",
            "IT-Versary",
            "IT-Esega",
            "BUILD-IT",
            "Sporti",
            "Pilmapres TI",
            "ITCC & Semnas TI",
            "Musang HMTI",
            "Studek",
            "PERMIKOMNAS",
            "Tirta Yatra HMTI"
    };

    private static String [] deskripsiProker = {
            "Pelatihan PKM TI adalah kegiatan yang bertujuan untuk memberikan pemahaman dasar tentang PKM serta cara menemukan ide dan menyususan proposal PKM. Selain pemberian materi juga terdapat sesi klinik PKM TI, yang merupakan rangakaian dari kegiatan Pelatihan PKM TI yang telah dilaksanakan sebelumnya. Pada sesi klinik, dosen pembina akan memberikan pengarahan dan hasil penilaian berdasarkan draft proposal PKM yang telah dibuat oleh peserta.",
            "Bakti Sosial Teknologi Informasi (Baksos TI) adalah salah satu program kerja HMTI yang berupa kegiatan amal atau pengabdian masyarakat yang bertujuan untuk membantu masyarakat desa yang memerlukan bantuan. Bantuan yang diberikan berupa sembako, perangkat lunak, perangkat keras, tanaman, ataupun berupa barang lainnya yang sekiranya sesuai dengan keadaan desa tersebut sehingga dapat bermanfaat dan dapat membantu desa tersebut untuk lebih maju dan berkembang.",
            "IT-Versary merupakan singkatan dari Information Technology Anniversary yaitu serangkaian acara perayaan ulang tahun dari Program Studi Teknologi Informasi Universitas Udayana. Kegiatan ini memiliki tujuan utama untuk mempererat solidaritas, kebersamaan dan rasa kekeluargaan antar civitas Program Studi Teknologi Informasi Universitas Udayana. Rangkaian acara pada umumnya yaitu Ceremony dengan simbolis pemotongan tumpeng, penampilan dari setiap angkatan, perlombaan eksternal, serta acara hiburan.",
            "IT-ESEGA (Information Technology Electronic Sport Based on Excellent Games) merupakan suatu program kerja HMTI yang secara khusus memperlombakan cabang olahraga yang berkategorikan electronic sport (e-sport). IT-ESEGA merupakan kompetisi yang terbuka untuk umum dengan cabang e-sport yaitu PUBG Mobile, Mobile Legend dan Valorant. Salah satu tujuan dari kegiatan ini adalah untuk memperkenalkan Program Studi Teknologi Informasi Fakultas Teknik Universitas Udayana kepada umum.",
            "BUILD-IT (Basic Undertanding In Learn and Developing Information Technology) merupakan program kerja dari HMTI yang memberikan materi dasar di Program Studi Teknologi Informasi kepada mahasiswanya yang baru. Dipaparkan dua jenis materi kepada para peserta, dimana pemaparan materi pertama yaitu Algoritma & Pemrograman yang berfokus pada dasar logika dan bahasa pemrograman C/C++. Pemaparan materi kedua mengenai Basis Data yang berfokus pada dasar basis data serta praktik berdasarkan kasus yang umum dijumpai.",
            "Sporti merupakan salah satu acara rutin tahunan yang dilaksanakan oleh mahasiswa Teknologi Informasi untuk mempererat hubungan mahasiswa Teknologi Informasi khususnya antar angkatan dan juga sebagai sarana untuk menyalurkan minat dan bakat dari mahasiswa khususnya pada bidang non-akademik yaitu olahraga. Kegiatan ini juga dapat menjadi wadah untuk refreshing bagi seluruh mahasiswa TI di tengah-tengah penatnya menempuh bangku kuliah pada Program Studi Tekonologi Informasi.",
            "Pilmapres TI atau Pemilihan Mahasiswa Berprestasi Teknologi Informasi merupakan salah satu program kerja terbaru yang dimiliki oleh HMTI yang berkecimpung dalam bidang akademik yaitu seleksi terhadap mahasiswa berprestasi yang ada pada Program Studi Teknologi Informasi. Mahasiswa yang lolos seleksi pada kegiatan Pilmapres TI ini nantinya akan bertugas untuk mewakili Program Studi Teknologi Informasi pada kegiatan Pilmapres tingkat Fakultas Teknik Universitas Udayana.",
            "Information Technology Creative Competition merupakan ajang perlombaan sebagai wadah untuk mengembangkan kemampuan dalam bidang teknologi informasi bagi siswa SD, SMP, SMA/K dan Mahasiswa. Kegiatan ITCC ini juga merupakan program kerja tahunan terbesar diantara program kerja lainnya yang dimiliki oleh HMTI. Kegiatan ITCC juga memiliki kegiatan seminar tingkat nasional yaitu Seminar Nasional Teknologi Informasi, yang menjadi salah satu rangkaian ITCC dan diadakan beberapa hari sebelum puncak perlombaan",
            "Musang HMTI atau Musyawarah Anggota HMTI merupakan salah satu program kerja wajib yang diadakan oleh HMTI. Kegiatan tahunan ini bertujuan untuk melakukan evaluasi terhadap kinerja fungsionaris HMTI sebelumnya dan juga aturan bagi mahasiswa TI. Pada kegiatan ini juga sekaligus melakukan pemilihan ketua HMTI untuk periode berikutnya. Kegiatan ini memiliki beberapa rangkaian yaitu Rapat Angkatan, Rapat Pra-Musang, Musang, Debat Kandidat, Pemira, dan Penghitungan Suara.",
            "Studek atau Studi Ekskursi merupakan kegiatan eksternal dimana mahasiswa Teknologi Informasi Universitas Udayana berkunjung ke instansi ataupun perguruan tinggi lain dengan tujuan pertukaran ilmu dan pikiran untuk menambah wawasan dengan mahasiwa lain di luar Universitas Udayana. Pada awal tahun 2020 lalu, HMTI mengadakan studi ekskursi ke beberapa instansi dan perguruan tinggi yang berada di Surabaya dan Malang, seperti Dinas Komunikasi & Informatika Surabaya, Departemen Teknik ITS, dan perguran tinggi lainnya. ",
            "PERMIKOMNAS merupakan singkatan dari Perhimpunan Mahasiswa Informatika dan Komputer Nasional yang beranggotakan berbagai himpunan mahasiswa teknologi informasi, infortika, ilmu komputer, dan sejenisnya yang berasal dari berbagai pergururan tinggi di Indonesia yang dimana terbagi atas 13 wilayah di 34 provinsi. HMTI FT UNUD tergabung pada wilayah XIII yang mencakup wilayah Bali, NTB, dan NTT.",
            "Tirta Yatra HMTI merupakan kegiatan tahunan yang diselenggarakan oleh HMTI ke pura-pura yang terdapat di Bali. Tirta Yatra sendiri dalam pemahaman bahasa sehari-hari di Bali dipahami dengan tangkil atau melakukan persembahyang ke beberapa pura. Tirta Yatra yang dilakukan oleh HMTI bertujuan sebagai bentuk rasa syukur kepada Tuhan atas berkat dan bimbingan yang telah diberikan pada saat periode sebelumnya dan sekaligus memohon restu kepada beliau untuk menjalankan roda organisasi HMTI di periode berikutnya."
    };

    private static int[] fotoProker = {
            R.drawable.pkmti,
            R.drawable.baksos,
            R.drawable.itver,
            R.drawable.esega,
            R.drawable.buildit,
            R.drawable.sporti,
            R.drawable.pilmapres,
            R.drawable.itcc,
            R.drawable.hmti,
            R.drawable.studek,
            R.drawable.permikomnas,
            R.drawable.tirtayatra,
    };

    static ArrayList<Proker> getlistData(){
        ArrayList<Proker> list = new ArrayList<>();
        for (int pos = 0; pos <namaProker.length; pos++){
            Proker  proker = new Proker();
            proker.setNama(namaProker[pos]);
            proker.setDeskripsi(deskripsiProker[pos]);
            proker.setFoto(fotoProker[pos]);
            list.add(proker);
        }
        return list;
    }
}
