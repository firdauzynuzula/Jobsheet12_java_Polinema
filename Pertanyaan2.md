Pertanyaan
1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
Jelaskan alasan Anda.


jawab:
1. Parameter: sebagai tempat untuk data masukan yang akan diolah
dalam fungsi. Banyaknya parameter menyesuaikan kebutuhan. Setiap
parameter terdiri dari tipe data dan nama parameter (misal: int a,
float b), sama persis seperti deklarasi variabel.
2. Karena data yang diterima berupa nama dan boolean berupa true atau false
3. Tidak sama. Semua parameter adalah variabel (karena mereka menyimpan nilai), 
   tetapi tidak semua variabel adalah parameter. Parameter adalah jenis variabel khusus dengan peran yang sangat spesifik sebagai input untuk fungsi. 
4. cara kerja parameter isMember adalah ketika inputan atau data bernilai true maka program akan mencetak output berupa "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!" , 
   sedangkan jika bernilai false maka program tidak mencetak output berupa "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!" 
5. Yang terjadi adalah error karena argument berupa string dan boolean tidak terpenuhi.
6. Sudah