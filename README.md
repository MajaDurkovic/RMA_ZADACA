# RMA_ZADACA - Inspired - Aplikacija o inspirirajućim ljudima

# Zadatak
Korištenjem naučenoga na ovoj vježbi, kreirajte jednostavnu aplikaciju koja nudi
informacije o tri osobe iz povijesti računarstva koje Vas inspiriraju i za koje smatrate da
su imale važan utjecaj. Za svaku osobu potrebno je staviti sliku, datum rođenja/smrti, i
kratak životopis. Definirati klik na sliku koji ispisuje nasumičan citat te osobe u obliku
Toast poruke, citate je moguće spremiti u XML datoteku u obliku polja stringova.
Aplikaciju je potrebno testirati na barem dva uređaja (stvarna ili virtualna), te osmisliti
ikonu. Cjelokupni projekt potrebno je staviti u arhivsku datoteku (.zip,.rar,.7z) i postaviti
u odgovarajuću mapu na loomen servisu.

# Rješavanje zadaće
Za rješavanje zadaće i problema koji su se pojavili korišteni su https://developer.android.com/guide , https://stackoverflow.com/, 
te rješeni primjer sa loomena. Za izradu aplikacije korišten je RelativeLayout, u kojem je posađen TableLayout kao podloga za TableRow. 
U početnoj fazi u relativnom layout-u bio je smješten samo TableRow, ali se bez TableLayout-a (parent) ponašao kao horizontalni linearni 
layout. U svaki TableRow smještene su informacije o jednoj osobi. ImageButton je korišten za prikaz slike i omogućavanje ispisa Toast-a 
prilikom klika na sliku. Također TableRow sadrži ScrollView u kojem se nalazi životopis svake osobe.
Prilikom izrade TextView-a problem je bio podesiti tekst tako da se prikaže u točno zadanom prostoru parent layout-a.
Rješenje je bilo pomaknuti desnu marginu TextView-a točno za veličinu ImageButton-a.
Informacije o odabranim osobama su preuzete sa Wikipedije.

# Izgled aplikacije
![screenshot_2018-03-29-18-07-25](https://user-images.githubusercontent.com/37849326/38105258-dc4a3262-338b-11e8-95ec-e747619323ff.png)
