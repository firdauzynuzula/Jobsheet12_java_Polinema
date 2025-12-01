Pertanyaan
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...
namaPengunjung!
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban
Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
Jika tetap berjalan, bagaimana output yang dihasilkan?


Jawaban

1. Penulisan parameter dengan String... namaPengunjung menunjukkan bahwa metode tersebut dapat menerima
jumlah argumen String yang tidak terbatas. Ini memungkinkan fleksibilitas dalam pemanggilan metode,
karena pengguna dapat memberikan satu atau lebih nama pengunjung tanpa harus membuat overload metode
untuk setiap jumlah argumen yang berbeda.

2. Berikut adalah modifikasi method daftarPengunjung menggunakan for-each loop:
public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}

3. Tidak, kita tidak dapat menggunakan dua tipe data varargs dalam satu fungsi. Aturan varargs di Java
menyatakan bahwa hanya satu parameter varargs yang diizinkan dalam sebuah metode, dan itu harus menjadi
parameter terakhir. Jika kita mencoba untuk menambahkan lebih dari satu parameter varargs, maka akan menghasilkan error kompilasi.

4. Jika fungsi daftarPengunjung dipanggil tanpa argumen, program akan tetap berjalan tanpa error.
Output yang dihasilkan akan menunjukkan bahwa tidak ada pengunjung yang terdaftar, seperti berikut:
daftarPengunjung();
Output: 

Daftar Pengunjung:
(Tidak ada nama pengunjung yang ditampilkan karena tidak ada argumen yang diberikan.)