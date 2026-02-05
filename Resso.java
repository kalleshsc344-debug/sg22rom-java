class Resso{
public static void main(String[] songs){
String songNames[]={"Rasputin","Wise","Believer","Tulasi","Manohari"};
int length=songNames.length;
/*String getFirstSong=songNames[0];
String getSecondSong=songNames[1];
String getThirdSong=songNames[2];
String getFourthSong=songNames[3];
String getFifthSong=songNames[4];*/
System.out.println("The number of songs: "+length);
System.out.println("They are:");
//System.out.println("The list of songs are:\n"+getFirstSong+" "+getSecondSong+" "+getThirdSong+" "+getFourthSong+" "+getFifthSong);
for(String musics:songNames){
	System.out.println(musics);
}
}
}