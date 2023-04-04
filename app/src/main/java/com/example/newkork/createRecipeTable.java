package com.example.newkork;

public class createRecipeTable {
    public DatabaseRecept loadData(DatabaseRecept db){

        db.add("Brathähnchen mit Kräuterbutter und Zitrone", "1 Hähnchen, frisch (ca. 1,5 kg)\n" +
                "1 kg gekochte Kartoffeln\n" +
                "½ Knollensellerie\n" +
                "125g Butter\n" +
                "1TL Tomatenmark\n" +
                "2 Zitronen\n" +
                "2 Stiele Thymian\n" +
                "2 Knoblauchzehen\n" +
                "2 EL Olivenöl\n" +
                "1 Prise Salz\n" +
                "1 Prise Pfeffer","1.\tFür die Kräuterbutter den Knoblauch fein hacken, die Thymianblättchen abzupfen und die Schale von einer Zitrone abreiben. Die weiche Butter mit Zitronenschale, Knoblauch, Thymian, Tomatenmark, Salz und Pfeffer geschmeidig verarbeiten. \n" +
                "2.\tDas Hähnchen waschen und trocken tupfen. Die Schenkel einschneiden und mit Kräuterbutter füllen, vom Hals aus, die Haut aufschieben und zwischen Fleisch und Haut Kräuterbutter verteilen. Die restliche Butter in das Hähnchen füllen. Die abgeriebene Zitrone in Scheiben schneiden und in das Hähnchen füllen. \n" +
                "3.\tDas Hähnchen in eine ofenfeste Form geben. Sellerie schälen und in Würfel schneiden, die gekochten Kartoffeln vierteln und beides um das Hähnchen herum legen. Mit dem Saft von einer Zitrone beträufeln, mit Salz und Pfeffer bestreuen und zum Schluss alles mit Olivenöl beträufeln. \n" +
                "4.\tIm vorgeheizten Ofen im unteren Drittel 2 Stunden bei 220°C braten.","Fisch/Fleisch","Hauptspeise", "Trockene Weißweine");
        db.add("Zitronen Butter Scampi", "500g Spaghetti\n" +
                "250g Garnelen\n" +
                "350ml Sahne\n" +
                "1 Becher Crème fraîche\n" +
                "85g Butter\n" +
                "½ Zwiebel, gewürfelt\n" +
                "1 Knoblauchzehe\n" +
                "½ Zitrone, Saft davon\n" +
                "1 Prise Salz\n" +
                "1 Prise Pfeffer\n" +
                "Gemüsebrühe\n" +
                "Etwas Parmesan, gerieben","1.\tDie Spaghetti in Salzwasser kochen. \n" +
                "Währenddessen Zwiebel und Knoblauch mit der Butter in einem separaten Topf 1 Min. andünsten. \n" +
                "2.\tDanach die bereits aufgetauten Garnelen dazugeben und anbraten. Wenn die Garnelen die gewünschte orange Farbe haben, die Sahne und die Crème fraîche dazugeben und erwärmen. \n" +
                "3.\tUnter Rühren den Zitronensaft und den geriebenen Parmesan zur Soße geben und aufkochen lassen. Die Soße mit Gemüsebrühe, Salz und Pfeffer würzen, abschmecken und dann die fertig gekochten Spaghetti in die Soße geben und ca. 1 Minute gut umrühren, so dass die Nudeln komplett in der Soße gewälzt sind. \n" +
                "4.\tWenn die Nudeln auf den Tellern angerichtet sind, etwas Parmesan darauf streuen.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Gebratener Zander auf Spinat", "800g Spinat, frisch\n" +
                "4 Zanderfilet, mit Haut\n" +
                "40g Pinienkerne\n" +
                "5 Knoblauch Zehen\n" +
                "60g Butter\n" +
                "2 Zitronen, Bio\n" +
                "4 EL Olivenöl\n" +
                "Salz\n" +
                "Pfeffer", "1.\tZander auf der Hautseite 2–3-mal leicht einschneiden und mit Salz würzen. Pinienkerne in eine beschichtete Pfanne ohne Öl geben und leicht anrösten, dann bei Seite stellen.\n" +
                "2.\tSpinat waschen und abtropfen lassen. Butter mit ein paar Tropfen Öl in eine beschichtete Pfanne geben und Spinat darin bei mittlerer Hitze kurz braten. Knoblauch schälen, auspressen und zum Spinat geben. Zitronenschalen mit dem Messer hauchdünn abschneiden und ebenfalls zum Spinat geben. Spinat mit Salz und Pfeffer abschmecken und anschließend Pinienkerne unterheben.\n" +
                "3.\tÖl in eine weitere beschichtete Pfanne geben und Zanderstücke auf der Hautseite anbraten. Nach etwa 3 Minuten wenden und für weitere 3 Minuten braten. Zander aus der Pfanne nehmen und kurz auf einem Küchentuch ruhen lassen.\n" +
                "4.\tSpinat auf den Tellern anrichten, Zanderstücke jeweils mit der Hautseite nach oben auf den Spinat legen und servieren.","Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Zitronen Risotto", "1 m.-große Zwiebel, fein gewürfelt\n" +
                "2 große Knoblauchzehen, fein gehackt\n" +
                "2 EL Olivenöl\n" +
                "300g Risottoreis\n" +
                "1/8 Liter Weißwein, trocken\n" +
                "1 Liter Gemüsebrühe, heiß\n" +
                "25g Butter\n" +
                "1 Bund Petersilie, fein gehackt\n" +
                "½ Zitrone, ungespritzt, davon abgeriebene Schale und Saft", "1.\tDie Zwiebelwürfel in Öl kurz anschwitzen, Knoblauch und Reis dazugeben und unter ständigem Rühren durchschwitzen. \n" +
                "2.\tMit Wein ablöschen. Erst wenn dieser verkocht ist, Kellen weise die heiße Brühe dazu gießen, dabei immer wieder umrühren. \n" +
                "3.\tSobald der Reis gar ist (nach ca. 25 Min.), er sollte noch Biss haben, Zitronenschale und -saft, Butter, Parmesan und Petersilie unterrühren und das Risotto mit Salz und Pfeffer abschmecken.", "Vegetarisch/Vegan", "Hauptspeise", "Trockene Weißweine");
        db.add("Zitronentarte", "220 g Weizenmehl\n" +
                "60 g Zucker\n" +
                "1 Prise Salz\n" +
                "1 Ei\n" +
                "110 g Butter, kalt und in Flöckchen\n" +
                "3 große Zitronen, für 150 ml Saft und Abrieb\n" +
                "150 g Zucker\n" +
                "2 TL Speisestärke\n" +
                "100 g Butter\n" +
                "5 Eier", "1.\tFür den Mürbeteig Mehl, Zucker und Salz vermischen. Ei und kalte Butter in Flöckchen bzw. kleinen Stückchen mit in die Schüssel geben und alles zu einem glatten Teig verkneten. Am besten erst mit den Knethaken, dann nochmal kurz mit der Hand nacharbeiten. \n" +
                "2.\tGlatten Teig zu einer Kugel formen, in Frischhaltefolie wickeln und ca. 30 Minuten kühlstellen.\n" +
                "3.\tBackofen auf 175 Grad Ober- und Unterhitze vorheizen. Den Teig zwischen Folie oder auf einer bemehlten Arbeitsfläche zu einem großen Kreis ausrollen, der für den Boden einer 26-28 cm großen Tarteform inklusive eines kleinen Rands reicht (ca. 2 cm). In die Form legen. Eventuell am Rand überstehenden Teig mit einem scharfen Messer abschneiden. \n" +
                "4.\tDen Boden mehrfach mit einer Gabel einstechen und ca. 12 Minuten vorbacken. Währenddessen die Zitronencreme vorbereiten. Dafür die Zitronen heiß waschen, abtrocknen und abreiben. Halbieren und Saft auspressen. 150 ml vom Zitronensaft abmessen. Zitronensaft, -abrieb, Zucker und Speisestärke in einem Topf verrühren. Aufkochen lassen, die Butter in kleinen Stückchen zugeben und unter Rühren schmelzen lassen.\n" +
                "5.\tDie Eier mit einer Gabel verquirlen. Den Herd mit der Zitronen- Zucker-Masse auf niedrige bis mittlere Hitze zurückschalten und die verquirlten Eier mit einem Schneebesen unterrühren. Die Creme rund 5-7 Minuten unter ständigem Rühren etwas andicken lassen. Der Lemon Curd darf dabei auf keinen Fall kochen, weil die Eier sonst stocken und die Creme ausflockt.\n" +
                "6.\tZitronencreme auf dem vorgebackenen Boden verteilen und glattstreichen. Die Tarte dann noch einmal ca. 20 Minuten backen. Die Creme darf noch etwas weich sein. Falls die Oberfläche gegen Ende hin etwas zu dunkel werden sollte, einfach mit Folie abdecken. Tarte abkühlen lassen und dann ganz vorsichtig in Stücke schneiden, da sie sehr fein und mürbe ist.", "Vegetarisch/Vegan", "Nachtisch", "Trockene Weißweine");
        db.add("Ceasar Salad", "350g Mini-Romanasalat\n" +
                "100g Bacon \n" +
                "40g Parmesan, frisch gehobelt\n" +
                "3 Sardellenfilet\n" +
                "2 Knoblauchzehen\n" +
                "1 TL Senf\n" +
                "1 Eigelb\n" +
                "2 EL Weinessig, weiß\n" +
                "150 ml Sonnenblumenöl\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "1 EL Zitronensaft\n" +
                "30 g Hartkäse, gerieben\n" +
                "Für die Croûtons:\n" +
                "3 Schreiben Weißbrot\n" +
                "20g Butter", "1.\tFür das Dressing die Sardellenfilets und die geschälten Knoblauchzehen grob zerkleinern. Mit Senf, Eigelb und Essig im Mixer gründlich durchmixen. Das Öl langsam in feinem Strahl zugießen. Mit Salz, Pfeffer sowie Zitronensaft würzen und den geriebenen Käse untermixen. Bis zur Weiterverwendung in den Kühlschrank stellen. Vor dem Servieren ggf. etwas Wasser hinzufügen, falls das Dressing zu fest ist.\n" +
                "2.\tFür die Croûtons das Weißbrot in kleine unregelmäßige Ecken schneiden. Die Butter in einer Pfanne zerlassen und die Brotecken darin unter ständigem Rühren goldbraun braten. Herausnehmen, leicht salzen und abkühlen lassen.\n" +
                "3.\tDie Salatherzen putzen, waschen, trockenschleudern und in mundgerechte Stücke zerpflücken.", "Fisch/Fleisch", "Vorspeise", "Trockene Weißweine");
        db.add("Gemüsequiche", "300g Mehl\n" +
                "1 TL Salz\n" +
                "3 TL Backpulver\n" +
                "75 ml Öl\n" +
                "100 ml Wasser\n" +
                "1 Zwiebel, rot\n" +
                "2 Zehen Knoblauch\n" +
                "450g Gemüse, gemischt\n" +
                "200 ml Sahne\n" +
                "3 Eier\n" +
                "3 TL Senf\n" +
                "Salz\n" +
                "Pfeffer", "1.\tBei dem Gemüse hat man freie Wahl, je nach Geschmack. Ich nehme meistens ca. 150 g Brokkoli, 150 g Karotten, 100 g Lauch, 100 g TK-Erbsen.\n" +
                "2.\tDas Mehl, Salz und Backpulver in eine Schüssel sieben. Die flüssigen Zutaten zu den trockenen geben und zu einem Teig verarbeiten. Den Teig ruhen lassen, während man die Füllung zubereitet.\n" +
                "3.\tZwiebel schälen und würfeln, den Knoblauch fein hacken. Das Gemüse ggf. schälen und zerkleinern. Brokkoli also in Röschen teilen, Karotten und Lauch in Scheiben schneiden.\n" +
                "4.\tDen Brokkoli kurz in kochendem Wasser 5-8 Minuten vorgaren. \n" +
                "5.\tEtwas Olivenöl in einer Pfanne erhitzen. Zwiebel und Knoblauch glasig anschwitzen, dann das Gemüse zugeben. Kurz anbraten und dann ca. 10-15 Min. dünsten. Mit Salz und Pfeffer würzen. Wer möchte kann noch gehackten Schnittlauch oder Petersilie dazugeben. Pfanne von der Platte nehmen.\n" +
                "6.\tIn einem Gefäß die Sahne/Sojasahne/Sahneersatz mit den Eiern verquirlen. Mit Senf, Salz und Pfeffer nicht zu fade würzen und abschmecken.\n" +
                "7.\tDen Teig ausrollen und anschließend in eine gefettete Springform legen und mit den Fingern am Rand hochdrücken. Das Gemüse einfüllen und darauf die Sahne-Eier-Mischung verteilen.\n" +
                "Im vorgeheizten Ofen bei ca. 200°C Umluft 30-35 Min. backen. ", "Vegetarisch/Vegan", "Vorspeise", "Trockene Weißweine");
        db.add("Paella", "240g Meeresfrüchte\n" +
                "2 Zwiebeln\n" +
                "2 Knoblauchzehen\n" +
                "4 Paprikaschoten, rot\n" +
                "1 Schuss Olivenöl\n" +
                "240g Rundkornreis\n" +
                "680 ml klare Suppe\n" +
                "1 Prise Safran\n" +
                "400g Hühnerfilets\n" +
                "1 Prise Salz\n" +
                "1 Prise Pfeffer\n" +
                "200g Erbsen\n" +
                "2 Zitronen", "1.\tFür die einfache Paella zuerst die tiefgekühlten Meeresfrüchte antauen lassen.\n" +
                "2.\tDanach Zwiebeln und Knoblauch schälen und fein hacken. Den Paprika waschen, entkernen und in Streifen schneiden. Einen Schuss Öl in einer Pfanne erhitzen und die Zwiebeln und den Knoblauch darin andünsten.\n" +
                "3.\tDanach Paprika, Safran und Reis zugeben, andünsten und mit der klaren Suppe ablöschen. Alles aufkochen lassen und ca. 25 Minuten bei leichter Hitze ausquellen lassen, bis der Reis die Flüssigkeit aufgenommen hat - der Reis muss bissfest sein.\n" +
                "4.\tIn der Zwischenzeit das Hühnerfleisch waschen und in kleine Stücke schneiden, im restlichen Öl in einer Pfanne anbraten und mit Salz und Pfeffer würzen.\n" +
                "5.\tDie aufgetauten Meeresfrüchte und die Erbsen ca. 15 Minuten vor Ende der Garzeit unter den Reis heben.\n" +
                "6.\tZum Schluss noch das Hühnerfleisch unterheben und die Paella zugedeckt kurz ruhen lassen.\n" +
                "7.\tDie Paella bei Bedarf noch einmal mit Salz und Pfeffer abschmecken und mit Zitronenspalten garniert servieren.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Forelle mit Salzkartoffeln", "1kg Kartoffeln\n" +
                "4 Forellen, frisch\n" +
                "1 Prise Salz\n" +
                "1 Prise Pfeffer\n" +
                "2 Eier\n" +
                "5 EL Paniermehl\n" +
                "5 EL Mehl\n" +
                "1 TL Essigessenz\n" +
                "200 ml Sahne\n" +
                "1 EL Zucker\n" +
                "1 Endiviensalat", "1.\tDie Kartoffeln schälen und in Salzwasser garkochen. Die Forellen waschen und von innen und außen salzen und pfeffern - dabei nicht sparsam sein!\n" +
                "2.\tEier verquirlen und die Forelle darin wenden. Mehl und Paniermehl miteinander mischen. Danach die Forelle in die Panade geben und darin wenden.\n" +
                "3.\tPfanne auf mittlere Hitze erhitzen und Butterschmalz zerlassen. Forellen bei mittlerer Hitze darin ca. 15 Minuten braten, bis sie schön knusprig sind. Ruhig Butter oder Butterfett bei Bedarf dazugeben.\n" +
                "4.\tDie Sahne in ein Gefäß geben, Zucker dazugeben und verrühren. Danach unter Rühren so lange Essig dazugeben, bis der gewünschte Säuregrad erreicht ist.\n" +
                "5.\tDen Salat waschen und zerzupfen. Das Dressing über den Salat geben und alles zusammen servieren.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Gedünsteter Lachs auf  Gemüse", "2 Knoblauchzehen\n" +
                "400g Karotten\n" +
                "4 Schalotten\n" +
                "400g Pastinake\n" +
                "2 Stangen Staudensellerie\n" +
                "400 ml Gemüsebrühe\n" +
                "Lachsfilet mit gedünstetem Gemüse\n" +
                "200 ml Weißwein\n" +
                "4 Lachsfilets\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "Olivenöl\n" +
                "Zitrone\n" +
                "Dill", "1.\tKnoblauch, Karotte, Schalotten und Pastinake schälen und in dünne Streifen schneiden. Sellerie waschen und in schräge Ringe schneiden.\n" +
                "2.\tGemüse in eine flache Pfanne mit Öl geben. Salzen und pfeffern und für ca. 2 Minuten bei mittlerer Hitze anschwitzen. Anschließend Gemüsebrühe und Weißwein dazugießen und aufkochen.\n" +
                "3.\tLachs abtupfen, auf Gräten kontrollieren und dann von beiden Seiten mit Salz und Pfeffer würzen. Anschließend die Lachsfilets auf das Gemüse legen. Hitze reduzieren und Pfanne mit einem Deckel bedecken. Lachs danach 4-6 Minuten dünsten. \n" +
                "4.\tDer gedünstete Lachs sollte von innen noch glasig sein und eine Kerntemperatur von 52-56°C haben.\n" +
                "5.\tGedünsteten Lachs mit dem Gemüse servieren und mit Zitrone und Dill anrichten. ", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Bauerneintopf", "800g Kartoffeln\n" +
                "3 Paprikaschoten\n" +
                "1 Zwiebel\n" +
                "2 Knoblauchzehen\n" +
                "1 EL Olivenöl\n" +
                "500g Rinderhackfleisch\n" +
                "2 EL Tomatenmark\n" +
                "2 EL Rotweinessig\n" +
                "400 ml Rinderbrühe\n" +
                "400g gehackte Tomaten\n" +
                "3 EL gehackte Petersilie\n" +
                "2 EL Paprikagewürz, edelsüß\n" +
                "Salz\n" +
                "Pfeffer", "1.\tKartoffeln schälen und in Würfel schneiden. Paprika kleinwürfeln. Zwiebel und Knoblauch kleinhacken.\n" +
                "2.\tÖl in einem Topf erhitzen und das Hackfleisch anbraten. Zwiebeln, Knoblauch und Paprika zugeben und kurz mitbraten. Tomatenmark zugeben und anschwitzen. Alles mit Rotweinessig ablöschen.\n" +
                "3.\tKartoffeln, Rinderbrühe und gehackte Tomaten, Petersilie und das Paprikagewürz in den Topf geben 30 Minuten köcheln lassen. Mit Salz und Pfeffer abschmecken.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Thai-Curry mit Gemüse", "1kg gemischtes Gemüse, z.B. Karotten, Paprika und Zucchini\n" +
                "1 Zwiebel\n" +
                "1 Knoblauchzehe\n" +
                "2 EL Kokosöl\n" +
                "500 ml Kokosmilch\n" +
                "1-3 große EL rote Currypaste, je nach Schärfe\n" +
                "1 Limette, gepresst\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "Chilli\n" +
                "Reis", "1.\tGemüse putzen und mundgerecht würfeln. Zwiebel und Knoblauch schälen und fein hacken.\n" +
                "2.\tKokosöl in einer großen Pfanne erhitzen. Gemüse circa 10 Minuten braten, dabei regelmäßig wenden. Zwiebel und Knoblauch hinzufügen und weitere 2-3 Minuten garen.\n" +
                "3.\tKokosmilch, Currypaste und Limettensaft in die Pfanne geben. 5-10 Minuten einköcheln lassen, dann mit Salz, Pfeffer und Chili abschmecken. Mit Reis servieren.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Chilli con Carne", "2 Zwiebeln\n" +
                "1 Knoblauchzehe\n" +
                "Öl, zum Braten\n" +
                "2 Chilischoten, rot\n" +
                "1 TL Kreuzkümmelpulver\n" +
                "2 TL Chilipulver\n" +
                "800g Rinderhackfleisch\n" +
                "3 Dosen Tomaten, geschält, je 400g\n" +
                "1 Zimtstange\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "2 Dosen Kidneybohnen, je 400g\n" +
                "Sambal Oelek\n", "1.\tDie Zwiebeln und den Knoblauch würfeln und in heißem Öl 5 Minuten anschwitzen, bis sie weich sind. Gehackte Chilischoten mit Kernen, Kreuzkümmel und Chilipulver hinzufügen und weitere 2 Minuten dünsten. \n" +
                "2.\tDas Rinderhack in den Topf geben und bei großer Hitze ringsherum krümelig anbraten. Die Dosentomaten und die Zimtstange unterrühren und mit Salz und Pfeffer kräftig würzen.\n" +
                "3.\tAlles auf mittlerer Flamme 90 Minuten köcheln lassen, dabei gelegentlich umrühren. 30 Minuten vor Ende der Garzeit die Bohnen hinzufügen und eventuell mit Sambal Oelek abschmecken (wem es noch nicht scharf genug sein sollte).\n" +
                "4.\tMit Weißbrot und einem Klecks Naturjoghurt oder Guacamole servieren. ", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Ziegenkäse Salat mit Beeren", "250g Wildkräutersalat\n" +
                "200g Blaubeeren\n" +
                "200g Brombeeren\n" +
                "200g Himbeeren\n" +
                "160g Ziegenfrischkäse\n" +
                "100g Bacon Streifen\n" +
                "60g Pinienkerne\n" +
                "2 EL Sesam\n" +
                "4 TL Zucker\n" +
                "Für die Vinaigrette:\n" +
                "4 EL Balsamico\n" +
                "2 EL Himbeeressig\n" +
                "6 EL Olivenöl\n" +
                "1 TL Senf\n" +
                "Salz\n" +
                "Pfeffer", "1.\tBackofen auf 180 Grad vorheizen. Salat und Waldbeeren waschen, den Salat trockenschleudern, die Waldbeeren abtropfen lassen.\n" +
                "2.\tEin Backblech mit Backpapier auslegen und die Bacon Streifen im vorgeheizten Ofen ca. 10 Minuten grillen, bis der Bacon schön kross ist. Um das überschüssige Fett aufzusaugen, den Bacon auf ein Küchenkrepp legen und abkühlen lassen.\n" +
                "3.\tIn einer trockenen Pfanne Sesam und Pinienkerne 1 Minute anrösten. Anschließend 1 Esslöffel Zucker dazu geben und die Kerne karamellisieren lassen.\n" +
                "4.\tFür die Vinaigrette Aceto Balsamico, Himbeeressig, Olivenöl und Senf in einer Schale mischen und mit Salz und Pfeffer abschmecken.\n" +
                "5.\tDen Bacon in mundgerechte Stücke brechen. Ziegenfrischkäse in kleine Stücke bröseln. Die Waldbeeren und den Ziegenfrischkäse mit dem Salat in eine Schüssel geben, Vinaigrette dazu und vorsichtig wenden.\n" +
                "6.\tSalat auf einem Teller anrichten, die kandierten Kerne und den Bacon darüber streuen. Servieren.", "Vegetarisch/Vegan", "Vorspeise", "Trockene Weißweine");
        db.add("Kartoffelgratin", "Butter, für die Form\n" +
                "1 Knoblauchzehe\n" +
                "800g Kartoffeln, festkochend\n" +
                "250 ml Sahne\n" +
                "250 ml Vollmilch\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "Muskat\n" +
                "1 EL Gemüsebrühepulver", "1.\tEine flache Gratinform mit Butter einfetten. Den Knoblauch schälen. Entweder fein würfeln und in der Form verteilen oder direkt in die Form pressen. \n" +
                "2.\tDie Kartoffeln schälen und in feine Scheiben schneiden (ich nehme dafür einen Gurkenhobel, das geht am schnellsten). Die Hälfte der Kartoffelscheiben in die Form schichten. \n" +
                "3.\tMit Kräutersalz und frisch geriebenem Muskat leicht würzen, anschließend die restlichen Kartoffeln darauf schichten.\n" +
                "4.\tDie Sahne und die Milch mischen. Mit dem Gemüsebrühepulver, Kräutersalz, Muskat und Pfeffer kräftig würzen. Diese Mischung über die Kartoffeln geben. Butterflöckchen auf dem Gratin verteilen.\n" +
                "5.\tIm vorgeheizten Backofen bei 180 °C Ober-/Unterhitze ca. 1 Stunde backen. Heiß servieren.", "Vegetarisch/Vegan", "Hauptspeise", "Trockene Weißweine");
        db.add("Beef-Burger mit Cheddarkäse", "Butter, für die Form\n" +
                "1 Knoblauchzehe\n" +
                "800g Kartoffeln, festkochend\n" +
                "250 ml Sahne\n" +
                "250 ml Vollmilch\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "Muskat\n" +
                "1 EL Gemüsebrühepulver", "1.\tEine flache Gratinform mit Butter einfetten. Den Knoblauch schälen. Entweder fein würfeln und in der Form verteilen oder direkt in die Form pressen. \n" +
                "2.\tDie Kartoffeln schälen und in feine Scheiben schneiden (ich nehme dafür einen Gurkenhobel, das geht am schnellsten). Die Hälfte der Kartoffelscheiben in die Form schichten. \n" +
                "3.\tMit Kräutersalz und frisch geriebenem Muskat leicht würzen, anschließend die restlichen Kartoffeln darauf schichten.\n" +
                "4.\tDie Sahne und die Milch mischen. Mit dem Gemüsebrühepulver, Kräutersalz, Muskat und Pfeffer kräftig würzen. Diese Mischung über die Kartoffeln geben. Butterflöckchen auf dem Gratin verteilen.\n" +
                "5.\tIm vorgeheizten Backofen bei 180 °C Ober-/Unterhitze ca. 1 Stunde backen. Heiß servieren.", "Fisch/Fleisch", "Hauptspeise", "Trockene Weißweine");
        db.add("Gegrille Hähnchenkeule mit Ananas- Salsa", "500 g Hähnchenschenkelfilets\n" +
                "Marinade\n" +
                "60 ml neutrales Pflanzenöl (z. B. Raps- oder Traubenkernöl)\n" +
                "3 EL Paprikapulver\n" +
                "1 ½ EL getrockneter Oregano\n" +
                "1 ½ EL frisch gepresster Zitronensaft\n" +
                "1 EL frisch gehackte Thymianblättchen oder 2 TL getrocknete\n" +
                "5 Knoblauchzehen, zerdrückt\n" +
                "2 TL Worcestershiresauce\n" +
                "1 TL weißer Pfeffer aus der Mühle\n" +
                "1 TL schwarzer Pfeffer aus der Mühle\n" +
                "½ TL Chilipulver\n" +
                "1 TL Salz\n" +
                "Salsa\n" +
                "neutrales Pflanzenöl (z. B. Raps- oder Traubenkernöl) zum Arbeiten\n" +
                "3 rote Paprikaschoten\n" +
                "½ Ananas Salz und schwarzer Pfeffer aus der Mühle\n" +
                "75 g rote Zwiebel, fein gewürfelt\n" +
                "1 große Avocado, gewürfelt\n" +
                "2 EL fein gehackte Minze, Koriandergrün, Basilikum oder Petersilie\n" +
                "1 EL brauner Zucker\n" +
                "1 EL frisch gepresster Limetten- oder Zitronensaft, plus mehr zum Servieren (optional)", "Alle Zutaten für die Marinade in einer mittleren Schüssel sorgfältig mischen.\n" +
                "Die Hähnchenschenkel in mundgerechte Stücke schneiden und in der Marinade schwenken, bis sie rundherum überzogen sind. Abgedeckt mindestens 6 Stunden (oder über Nacht) im Kühlschrank ziehen lassen.\n" +
                "Das Hähnchenfleisch in der Marinade 30 Minuten vor dem Garen aus dem Kühlschrank nehmen. Die Stücke auf Grillspieße aufpiksen (Holzspieße zunächst in Wasser einweichen, sonst verkohlen sie).\n" +
                "Den Grill auf mittlerer Stufe erhitzen und den Rost mit Öl fetten. Die Paprikaschoten auf dem heißen Grill (oder unter dem Ofengrill) rundherum schwärzen. In einen Gefrierbeutel geben und verschlossen beiseitelegen.\n" +
                "Die Ananas in 1,5 cm dicke Scheiben schneiden. Schale und inneren Strunk entfernen und entsorgen. Das Fruchtfleisch rundherum mit Salz und Pfeffer würzen und auf dem gefetteten Grillrost von beiden Seiten goldbraun und zart grillen. Dann würfeln und in einer Servierschüssel mit der roten Zwiebel mischen.\n" +
                "Die Haut von den Paprikaschoten ziehen und entsorgen, Stielansätze und Samen ebenfalls entfernen. Das Fruchtfleisch klein schneiden und zu den Ananaswürfeln geben. Kurz vor dem Servieren Avocado, Kräuter, Zucker und Zitrussaft untermischen und die Salsa mit Salz und Pfeffer abschmecken.\n" +
                "Zum Garen der Hähnchenspieße den sauberen Grillrost oder die Hotplate mit Öl bestreichen und auf mittlerer Stufe erhitzen. Das Fleisch auf dem heißen Grill rundherum schön goldbraun braten – das dauert ca. 7–10 Minuten. Dann nebeneinander in eine Auflaufform legen, locker mit Alufolie abdecken und vor dem Servieren 10 Minuten ruhen lassen.\n" +
                "Die Hähnchenspieße mit der Salsa servieren, nach Belieben beträufelt mit ein paar Spritzern frischem Limetten- oder Zitronensaft. Grüner Salat oder Krautsalat und frische Brötchen oder gegrillte Wraps schmecken hervorragend dazu.", "Fisch/Fleisch", "Hauptspeise", "Fruchtige Weißweine");
        db.add("Geflügel Ragout", "½ L Brühe instant\n" +
                "500g Hähnchenbrustfilets\n" +
                "250g Champignons\n" +
                "20g Butter\n" +
                "300g Erbsen, tiefgefroren\n" +
                "4 EL Weißwein\n" +
                "Soßenbinder\n" +
                "Salz \n" +
                "Pfeffer\n" +
                "Worcestersoße\n" +
                "Zucker\n" +
                "1/8 L Sahne\n" +
                "2 Eigelb\n" +
                "1 Bund Petersilie", "1.Die Brühe in einem Topf zum Kochen bringen. Das Hähnchenbrustfilet in Würfel schneiden und in der Brühe ca. 5 Minuten bei milder Hitze garen.\n" +
                "2.Butter in einer Pfanne erhitzen. Die Champignons putzen, in Scheiben schneiden und in der heißen Butter andünsten.\n" +
                "3.Die Brühe aufkochen lassen, die Pilze und Erbsen dazu geben und mit Wein und Salz, Pfeffer, Zucker und Worcestersoße abschmecken.\n" +
                "4.Den Topf vom Herd nehmen, Sahne und Eigelb verrühren und unter das Ragout mischen. Petersilie waschen, trockenschütteln, hacken und ebenfalls in das Ragout rühren.\n" +
                "5.Das Ragout entweder in vorbereitete Blätterreigpasteten füllen oder zu Reis oder Kartoffeln servieren.", "Fisch/Fleisch", "Hauptspeise", "Fruchtige Weißweine");
        db.add("Flammkuchen", "800g Mehl\n" +
                "4 TL Salz\n" +
                "4 EL Öl\n" +
                "440 ml Wasser\n" +
                "800g Schmand\n" +
                "Salz\n" +
                "Pfeffer\n" +
                "Muskat\n" +
                "8 Zwiebeln\n" +
                "400g Speck, in Würfeln", "Aus Mehl, Salz, Öl und Wasser einen Teig herstellen. Den Teig solange kneten, bis dieser nicht mehr an den Händen kleben bleibt, ansonsten noch etwas Mehl unterarbeiten. Mindestens 30 Minuten ruhen lassen.\n" +
                "Den Schmand glatt rühren und gerne mit etwas Salz, Pfeffer und Muskat würzen. Die Zwiebel abziehen, halbieren und in dünne Streifen schneiden.\n" +
                "Den Teig nun auf einer mit Mehl bestäubten Arbeitsfläche mit dem Nudelholz schön dünn ausrollen und auf ein Backblech oder einen Backstein geben. Jetzt mit Schmand bestreichen, Zwiebel darauf verteilen und mit dem Speck bestreuen.\n" +
                "Im vorgeheizten Ofen bei mindestens 200 °C gut 20 Minuten backen. ", "Fisch/Fleisch", "Hauptspeise", "Fruchtige Weißweine");
        db.add("Tagliatelle mit Kalbfleisch", "200g Spaghetti\t\n" +
                "Salz\n" +
                "200g Kalbsschnitzel\n" +
                "50g Rucola\n" +
                "1  Knoblauchzehe\n" +
                "4  getrocknete Tomaten in Öl\n" +
                "2 EL Öl\n" +
                "2 TL getrockneter Thymian\n" +
                "80 g Sahne\t\n" +
                "Pfeffer", "1.\tSpaghetti nach Packungsangabe in reichlich kochendem Salzwasser bissfest garen, in ein Sieb abgießen und abtropfen lassen.\n" +
                "2.\tInzwischen Kalbsschnitzel in feine Streifen schneiden. Den Rucola verlesen, waschen, trocken schütteln, grobe Stiele entfernen. Den Knoblauch schälen und fein würfeln. Dann die getrockneten Tomaten abtropfen lassen und in Streifen schneiden.\n" +
                "3.\tDas Öl in einer großen Pfanne erhitzen. Das Fleisch darin mit dem Thymian ca. 4 Min. bei mittlerer Hitze unter gelegentlichem Wenden anbraten. Knoblauch, Sahne und Tomaten hinzufügen, kurz aufkochen lassen und mit Salz und Pfeffer würzen. Die Nudeln und den Rucola dazugeben und alles gut vermengen. Nochmals mit Salz und Pfeffer abschmecken, auf zwei Tellern anrichten und servieren.", "Fisch/Fleisch", "Hauptspeise", "Fruchtige Weißweine");
        db.add("Palatschinken", "250g Mehl\n" +
                "½ L Milch\n" +
                "2 Eier\n" +
                "1 Prise Salz\n" +
                "1 Schuss Öl, für die Pfanne\n" +
                "1 EL Staubzucker\n" +
                "4 EL Marmelade", "1.\tFür die Palatschinken zuerst Mehl, Milch, Eier und Salz mit dem Schneebesen in einer Schüssel glatt rühren. Ca. 10 Minuten stehen lassen, dadurch wird der Teig etwas dicker und danach nochmals gut durchrühren.\n" +
                "2.\tSollte der Palatschinkenteig zu dick sein, mit etwas Mineralwasser oder Soda verdünnen.\n" +
                "3.\tIn einer beschichteten Pfanne einen Schuss Öl erhitzen (das Öl soll ganz heiß sein, aber nicht zu rauchen beginnen, dann gelingt die erste Palatschinke sofort). Dann etwas Teig (am besten mit einem Schöpfer) mittig in die heiße Pfanne hineingegeben. Die Pfanne dabei immer wieder schwenken, sodass der Boden gleichmäßig dünn mit Teig bedeckt ist.\n" +
                "4.\tMit dem Pfannenwender die Palatschinke mehrmals wenden und von beiden Seiten goldgelb ausbacken.\n" +
                "5.\tDie inzwischen fertig gebackenen Palatschinken im Backofen bei ca. 60 Grad Ober-/Unterhitze warm halten.\n" +
                "6.\tMit beliebigen Zutaten (Marmelade, Nutella, Schinken & Käse etc.) die Palatschinken bestreichen bzw. belegen und zusammenrollen.", "Vegetarisch/Vegan", "Nachtisch", "Fruchtige Weißweine");
        db.add("Schololadenmouse", "200g Schokolade, dunkle\n" +
                "3 Eier\n" +
                "200 ml Sahne\n" +
                "40g Zucker\n" +
                "50g Butter\n", "Eier trennen, Eiweiß und Sahne separat steif schlagen.\n" +
                "\n" +
                "Butter und Schokolade vorsichtig im Wasserbad schmelzen.\n" +
                "Eigelb in einer großen Schüssel mit 2 EL heißem Wasser cremig schlagen, den Zucker einrühren bis die Masse hell und cremig ist. Die geschmolzene Schokolade unterheben, anschließend sofort Eischnee und Sahne unterziehen (nicht mit dem Elektro-Mixer!).\n" +
                "\n" +
                "Mindestens 2 Stunden im Kühlschrank kalt stellen. Aber nicht zu kalt servieren.\n" +
                "Evtl. noch mit Schokostreuseln garnieren.", "Vegetarisch/Vegan", "Nachtisch", "Fruchtige Weißweine");
        db.add("Käseplatte", "350 g Etorki\n" +
                "1 Packung Géramont mit Joghurt\n" +
                "1 Packung Géramont cremig-leicht\n" +
                "1 Packung Saint Albray Légère Portionen\n" +
                "1 Packung Fol Epi Scheiben Légère\n" +
                "1 Becher BRESSO Légère Feine Kräuter\n" +
                "1 Packung Giovanni Ferrari - Pecorino Romano g.U.\n" +
                "100 g Weintrauben, blau (kernlos)\n" +
                "100 g Weintrauben, grün (kernlos)\n" +
                "2 EL Balsamici, weiß\n" +
                "1 Päckchen Bourbon-Vanillezucker\n" +
                "200 g Cantaloupe-Melonen\n" +
                "150 g Erdbeeren\n" +
                "1 Schale Physalis\n" +
                "100 g Feigensenfsauce\n" +
                "100 g Aprikosensenf", "1.\tZunächst wird der Käse für die Käseplatte zubereitet: Etorki in Würfel, Géramont mit Joghurt in Portionsstücke und Géramont Cremig-Leicht in Scheiben schneiden. \n" +
                "2.\tSaint Albray auspacken, Fol Epi Scheiben zusammenfalten, Bresso in eine Portionsschale füllen und Giovanni Ferrari in Stücke brechen.\n" +
                "3.\tAlle Käsesorten dekorativ auf einer Käseplatte anrichten.\n" +
                "4.\tJetzt werden die Früchte für die Käseplatte zubereitet: Trauben waschen, trocken tupfen, halbieren und mit etwas hellem Balsamico und Vanillezucker marinieren. Den Traubensalat in kleine Portionsgläser füllen und auf der Käseplatte anrichten.\n" +
                "5.\tDas Fruchtfleisch der Cantaloupemelone in Spalten schneiden und von der Schale lösen.\n" +
                "6.\tErdbeeren putzen und ggf. klein schneiden.\n" +
                "7.\tDie Früchte auf der Käseplatte dekorativ zwischen den Käsesorten arrangieren.", "Vegetarisch/Vegan", "Vorspeise", "Fruchtige Weißweine");


        return (db);
    }
}
