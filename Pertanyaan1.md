Pertanyaan
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
(mulai dari program dijalankan sampai daftar menu tampil di layar)

jawab: 
1. Tidak
2. Bisa 
3. Keuntungan menggunakan fungsi Menu() adalah untuk membuat kode agar mudah dibaca dan lebih ringkas , selain itu menulis kode dengan fungsi dapat memudahkan dalam melakukan maintance kode jika diperlukan
4. Mulai Eksekusi: Program dimulai, dan sistem operasi (OS) memuat program ke dalam memori dan mengarahkan eksekusi ke titik masuk utama program, yaitu fungsi main().
   Eksekusi main(): Fungsi main() mulai dieksekusi. Ini adalah tempat di mana logika utama program biasanya diinisialisasi.
   Pemanggilan Fungsi: Dalam tubuh fungsi main(), terjadi instruksi pemanggilan fungsi Menu().
   Kontrol berpindah: Segera setelah pemanggilan, kontrol eksekusi (program counter) melompat dari main() ke baris pertama kode di dalam definisi fungsi Menu().