public class ForEach {
    public static void main(String[] args) {

        String [] names = {
                "Muhammad", "Kurnia", "Affandi",
                "Mukura", "Laundry", "Shoes"
        };

        // menampilkan isi array names menggunakan for loop
//        for (var i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }


        // menampilkan isi array names menggunakan for each
        for (var name: names) {
            System.out.println(name);
        }
    }
}
