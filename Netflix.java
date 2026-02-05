class Netflix {
    public static void main(String[] entertain) {

        String hindiMovies[] = {"Dangal","PK","3 Idiots","Lagaan","Bahubali",
            "Gully Boy","Drishyam","Andhadhun","Barfi","Kesari",
            "Sultan","Chak De India","Kabir Singh","Dil Chahta Hai","Taare Zameen Par",
            "Zindagi Na Milegi Dobara","Raazi","Bajrangi Bhaijaan","War","Pathaan"};

        String englishMovies[] = {"Inception","Titanic","Avatar","Interstellar","Joker",
            "Gladiator","Avengers","Iron Man","Batman","Superman",
            "Doctor Strange","Thor","Captain America","Spider Man","Black Panther",
            "Deadpool","Matrix","John Wick","Fast and Furious","Mission Impossible"};

        String tamilMovies[] = {"Vikram","Master","Leo","Jailer","Kaithi",
            "Asuran","Soorarai Pottru","Jai Bhim","Bigil","Theri",
            "Mersal","Petta","Sivaji","Enthiran","Kabali",
            "Darbar","Valimai","Vedalam","Viswasam","Thunivu"};

        String teluguMovies[] = {"Baahubali","RRR","Pushpa","Ala Vaikunthapurramuloo","Magadheera",
            "Eega","Rangasthalam","Sye","Jalsa","Athadu",
            "Pokiri","Srimanthudu","Janatha Garage","DJ","AVPL",
            "Bharat Ane Nenu","Mirchi","Gabbar Singh","Temper","Khaleja"};

        String malayalamMovies[] = {"Drishyam","Lucifer","Premam","Bangalore Days","Charlie",
            "Kumbalangi Nights","Jallikattu","Joji","Kurup","Uyare",
            "Take Off","Virus","Mumbai Police","Memories","Neram",
            "Jacobinte Swargarajyam","Hridayam","Android Kunjappan","Home","Trance" };
System.out.println("Netflix Hindi Movies");
for (String movie : hindiMovies) System.out.println(movie);
System.out.println("Netflix English Movies");
for (String movie : englishMovies) System.out.println(movie);
System.out.println("Netflix Tamil Movies");
for (String movie : tamilMovies) System.out.println(movie);
System.out.println("Netflix Telugu Movies");
for (String movie : teluguMovies) System.out.println(movie);
System.out.println("Netflix Malayalam Movies");
for (String movie : malayalamMovies) System.out.println(movie);
    }
}
