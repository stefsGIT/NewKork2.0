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

        db.add("Gegrilltes Steak mit Béarnaise-Soße", "4 Rindersteaks (je ca. 200-250 g)\n" +
                "1 TL Salz\n" +
                "1 TL Pfeffer\n" +
                "2 EL Olivenöl\n" +
                "4 Eigelb\n" +
                "200 g Butter\n" +
                "2 EL Weißweinessig\n" +
                "2 EL Estragon, gehackt\n","Das Steak aus dem Kühlschrank nehmen und Raumtemperatur annehmen lassen. Das Salz und den Pfeffer auf beiden Seiten des Steaks verteilen.\n" +
                "Den Grill vorheizen und das Steak für ca. 3-4 Minuten pro Seite grillen (für medium-rare). Wenn das Steak die gewünschte Garstufe erreicht hat, vom Grill nehmen und für 5 Minuten ruhen lassen.\n" +
                "In der Zwischenzeit die Béarnaise-Soße zubereiten. Die Butter in einem Topf bei niedriger Hitze schmelzen lassen.\n" +
                "In einer separaten Schüssel das Eigelb mit dem Weißweinessig und 1 EL Wasser verrühren. Die Schüssel in ein Wasserbad stellen (es darf den Boden der Schüssel nicht berühren), und das Eigelb unter ständigem Rühren aufschlagen.\n" +
                "Die geschmolzene Butter langsam unter ständigem Rühren in die Eigelb-Mischung geben.\n" +
                "Die Soße vom Herd nehmen und den Estragon einrühren. Mit Salz und Pfeffer abschmecken.\n" +
                "Das Steak auf Teller legen und mit der Béarnaise-Soße servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Wildragout", "1 kg Wildfleisch (z.B. Reh, Hirsch oder Wildschwein), in mundgerechte Stücke geschnitten\n" +
                "2 Zwiebeln, gehackt\n" +
                "2 Karotten, geschält und in Scheiben geschnitten\n" +
                "2 Stangen Sellerie, in kleine Stücke geschnitten\n" +
                "3 Knoblauchzehen, gehackt\n" +
                "2 EL Mehl\n" +
                "500 ml Wildfond (oder Rinderbrühe)\n" +
                "250 ml Rotwein\n" +
                "2 Lorbeerblätter\n" +
                "1 TL Thymian\n" +
                "Salz und Pfeffer\n" +
                "2 EL Öl oder Butter zum Anbraten","Das Wildfleisch salzen und pfeffern und in einem großen Topf oder Bräter mit Öl oder Butter scharf anbraten, bis es von allen Seiten braun ist. Das Fleisch aus dem Topf nehmen und beiseite stellen.\n" +
                "Die gehackten Zwiebeln, Karotten und Sellerie in dem Topf anbraten, bis sie weich sind. Dann den Knoblauch hinzufügen und weitere 2 Minuten braten.\n" +
                "Das Mehl in den Topf geben und gut umrühren, um eine Mehlschwitze zu bilden.\n" +
                "Den Rotwein in den Topf geben und gut umrühren, um alle Bratreste vom Boden des Topfes zu lösen. Dann den Wildfond (oder Rinderbrühe) hinzufügen.\n" +
                "Das Fleisch wieder in den Topf geben und die Lorbeerblätter und Thymian hinzufügen. Alles gut umrühren und zum Kochen bringen.\n" +
                "Die Hitze reduzieren und das Ragout zugedeckt für ca. 2-3 Stunden köcheln lassen, bis das Fleisch weich und zart ist.\n" +
                "Vor dem Servieren das Ragout mit Salz und Pfeffer abschmecken und nach Wunsch mit Beilagen wie Kartoffelpüree, Spätzle oder Rotkohl servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Rinderbraten", "1,5 kg Rinderbraten (z.B. aus der Keule oder Schulter)\n" +
                "2 Zwiebeln, in Scheiben geschnitten\n" +
                "2 Karotten, geschält und in Scheiben geschnitten\n" +
                "2 Stangen Sellerie, in kleine Stücke geschnitten\n" +
                "4 Knoblauchzehen, gehackt\n" +
                "2 EL Tomatenmark\n" +
                "500 ml Rinderbrühe\n" +
                "250 ml Rotwein\n" +
                "2 Lorbeerblätter\n" +
                "1 TL Thymian\n" +
                "2 EL Öl oder Butter zum Anbraten\n" +
                "Salz und Pfeffer\n","Den Rinderbraten aus dem Kühlschrank nehmen und mindestens eine Stunde vor dem Braten Raumtemperatur annehmen lassen. Den Backofen auf 160 Grad Celsius vorheizen.\n" +
                "Das Fleisch von allen Seiten mit Salz und Pfeffer würzen. In einem großen Bräter oder in einem gusseisernen Topf das Öl oder die Butter erhitzen und den Rinderbraten von allen Seiten anbraten, bis er rundherum braun ist. Das Fleisch aus dem Topf nehmen und die Zwiebeln, Karotten, Sellerie und Knoblauch in dem verbliebenen Fett anbraten, bis sie weich sind. Das Tomatenmark hinzufügen und 2-3 Minuten mitbraten. Mit Rotwein ablöschen und gut umrühren, um alle Bratreste vom Boden des Topfes zu lösen. Dann die Rinderbrühe (oder Gemüsebrühe) hinzufügen. Den Rinderbraten wieder in den Topf legen und die Lorbeerblätter und Thymian hinzufügen. Den Topf mit einem Deckel verschließen und in den vorgeheizten Ofen stellen. Das Fleisch für 2-3 Stunden schmoren lassen, bis es weich und zart ist.\n" +
                "Alle 30 Minuten den Rinderbraten mit der Bratflüssigkeit übergießen. Wenn das Fleisch gar ist, aus dem Topf nehmen und warm stellen. Die Bratflüssigkeit durch ein Sieb passieren, um die Gemüsestücke und Lorbeerblätter zu entfernen. Die Flüssigkeit kann anschließend als Sauce zum Rinderbraten serviert werden. Vor dem Servieren den Rinderbraten in Scheiben schneiden und mit der Sauce und Beilagen wie Kartoffelpüree, Rotkohl oder Gemüse servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Gegrillte Lammkoteletts", "8 Lammkoteletts\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "2 EL frischer Rosmarin, gehackt\n" +
                "2 EL frischer Thymian, gehackt\n" +
                "3 EL Olivenöl\n" +
                "1 TL Salz\n" +
                "1/2 TL schwarzer Pfeffer\n","In einer Schüssel den Knoblauch, den Rosmarin, den Thymian, das Olivenöl, das Salz und den Pfeffer vermischen.\n" +
                "Die Lammkoteletts in die Schüssel geben und gründlich mit der Marinade bedecken. Die Koteletts für mindestens 30 Minuten (besser noch länger) im Kühlschrank marinieren lassen.\n" +
                "Den Grill vorheizen (mittlere Hitze).\n" +
                "Die Lammkoteletts aus der Marinade nehmen und auf den Grillrost legen.\n" +
                "Die Koteletts für etwa 4-5 Minuten auf jeder Seite grillen (je nach gewünschtem Gargrad).\n" +
                "Die gegrillten Lammkoteletts vom Grill nehmen und für ein paar Minuten ruhen lassen, damit sich die Säfte wieder verteilen können.\n" +
                "Die Lammkoteletts servieren und genießen!\n" +
                "Dazu passen z.B. ein frischer Salat und Ofenkartoffeln oder gegrilltes Gemüse.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Entrecôtes", "4 Entrecôtes (je ca. 250 g)\n" +
                "2 EL Olivenöl\n" +
                "1 EL Butter\n" +
                "2 Schalotten, fein gehackt\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "250 ml Rotwein\n" +
                "250 ml Rinderbrühe\n" +
                "2 EL Tomatenmark\n" +
                "2 Zweige frischer Thymian\n" +
                "Salz und Pfeffer nach Geschmack\n","Die Entrecôtes aus dem Kühlschrank nehmen und ca. 30 Minuten vor der Zubereitung auf Raumtemperatur kommen lassen.\n" +
                "Eine Pfanne bei mittlerer bis hoher Hitze erhitzen und das Olivenöl hinzufügen.\n" +
                "Die Entrecôtes von beiden Seiten je ca. 3-4 Minuten braten (für medium-rare). Aus der Pfanne nehmen und warm halten.\n" +
                "Die Butter in derselben Pfanne schmelzen lassen und die gehackten Schalotten und Knoblauch darin anbraten, bis sie weich und golden sind.\n" +
                "Das Tomatenmark hinzufügen und für 1-2 Minuten anbraten.\n" +
                "Den Rotwein und die Rinderbrühe hinzufügen und unter ständigem Rühren aufkochen lassen.\n" +
                "Die frischen Thymianzweige hinzufügen und für 10-15 Minuten köcheln lassen, bis die Soße eingedickt ist.\n" +
                "Die Soße mit Salz und Pfeffer abschmecken.\n" +
                "Die Entrecôtes auf Teller geben und mit der Rotweinsoße übergießen.\n" +
                "Mit Beilagen wie Kartoffelgratin, Gemüse oder einem Salat servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Bolognese", "500 g Hackfleisch (Rind oder gemischt)\n" +
                "1 Zwiebel, gehackt\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "2 Karotten, gewürfelt\n" +
                "2 Selleriestangen, gewürfelt\n" +
                "1 Dose Tomaten (400 g)\n" +
                "1 EL Tomatenmark\n" +
                "250 ml Rinderbrühe\n" +
                "1 TL getrockneter Oregano\n" +
                "1 TL getrockneter Thymian\n" +
                "1 Lorbeerblatt\n" +
                "Salz und Pfeffer\n" +
                "Olivenöl\n" +
                "400 g Spaghetti\n","Erhitzen Sie etwas Olivenöl in einer großen Pfanne bei mittlerer Hitze und geben Sie die gehackte Zwiebel und den Knoblauch hinzu. Braten Sie sie für 2-3 Minuten an, bis sie weich sind.\n" +
                "Fügen Sie das Hackfleisch hinzu und braten Sie es für ca. 5-7 Minuten an, bis es braun und krümelig ist.\n" +
                "Geben Sie die gewürfelten Karotten und Selleriestangen hinzu und braten Sie sie für weitere 5 Minuten an.\n" +
                "Geben Sie das Tomatenmark hinzu und braten Sie es für 1-2 Minuten an, bis es duftet.\n" +
                "Geben Sie die Dose Tomaten, Rinderbrühe, Oregano, Thymian und Lorbeerblatt hinzu. Gut umrühren.\n" +
                "Lassen Sie die Bolognese für 30-40 Minuten bei niedriger Hitze köcheln, gelegentlich umrühren, bis sie dick und sämig ist. Mit Salz und Pfeffer abschmecken.\n" +
                "In der Zwischenzeit, kochen Sie die Spaghetti gemäß den Anweisungen auf der Verpackung.\n" +
                "Servieren Sie die Bolognese auf den Spaghetti und garnieren Sie es mit frisch geriebenem Parmesan.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Käsefondue", "400 g geriebener Käse (z.B. Emmentaler, Gruyere oder Appenzeller)\n" +
                "1 Knoblauchzehe, halbiert\n" +
                "1 Tasse trockener Weißwein\n" +
                "1 EL Maisstärke\n" +
                "1 EL Zitronensaft\n" +
                "1 Prise Muskatnuss\n" +
                "1 Baguette, in kleine Würfel geschnitten\n","Reiben Sie den Käse und mischen Sie ihn in einer Schüssel zusammen mit der Maisstärke.\n" +
                "Reiben Sie die Knoblauchhälften auf den Boden und an den Seiten eines schweren Topfes.\n" +
                "Gießen Sie den Weißwein in den Topf und erhitzen Sie ihn bei mittlerer Hitze. Bringen Sie ihn nicht zum Kochen.\n" +
                "Fügen Sie den geriebenen Käse nach und nach hinzu und rühren Sie ständig, bis der Käse vollständig geschmolzen ist.\n" +
                "Fügen Sie den Zitronensaft und die Muskatnuss hinzu und rühren Sie noch einmal.\n" +
                "Wenn das Fondue zu dick ist, fügen Sie etwas mehr Weißwein hinzu, um es zu verdünnen.\n" +
                "Fertig ist das Käsefondue! Servieren Sie es mit den Baguette-Würfeln.\n" +
                "Hinweis: Stellen Sie sicher, dass Sie das Fondue während des Essens warm halten. Dazu können Sie das Fondue in einem Fondue-Set oder einem Topf auf einem Rechaud platzieren.","Vegetarisch/Vegan","Hauptspeise", "Kräftige Rotweine");

        db.add("Gebratene Lachsfilets", "4 Lachsfilets à 150 g\n" +
                "2 EL Olivenöl\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "1 TL Paprikapulver\n" +
                "Salz und Pfeffer\n" +
                "1 Zitrone\n","Den Ofen auf 200°C vorheizen.\n" +
                "Die Lachsfilets mit Salz und Pfeffer würzen.\n" +
                "Das Olivenöl in einer Pfanne erhitzen und den Knoblauch hinzufügen. Bei mittlerer Hitze etwa eine Minute braten, bis der Knoblauch duftet.\n" +
                "Das Paprikapulver hinzufügen und umrühren.\n" +
                "Die Lachsfilets auf beiden Seiten in der Pfanne anbraten, bis sie goldbraun sind.\n" +
                "Legen Sie die Lachsfilets in eine ofenfeste Form und geben Sie etwas von der Knoblauch-Paprika-Mischung über die Filets.\n" +
                "Backen Sie die Lachsfilets im Ofen für ca. 10-15 Minuten, bis sie durchgegart sind.\n" +
                "Mit Zitronenscheiben servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Gegrillte Bratwürste", "8 Bratwürste (z.B. Nürnberger oder Thüringer)\n" +
                "4 EL Olivenöl\n" +
                "2 EL Senf\n" +
                "1 EL Honig\n" +
                "Salz und Pfeffer\n" +
                "1 Zitrone\n","Den Grill auf mittlere bis hohe Hitze vorheizen.\n" +
                "Die Bratwürste mit Olivenöl einreiben und mit Salz und Pfeffer würzen.\n" +
                "Die Bratwürste auf den Grill legen und etwa 10-15 Minuten grillen, bis sie goldbraun und durchgegart sind. Gelegentlich wenden.\n" +
                "In der Zwischenzeit in einer Schüssel Senf und Honig vermischen.\n" +
                "Die gegrillten Bratwürste mit der Senf-Honig-Mischung bestreichen.\n" +
                "Mit Zitronenscheiben servieren.","Fisch/Fleisch","Hauptspeise", "Kräftige Rotweine");

        db.add("Tomatenrisotto", "300 g Risottoreis\n" +
                "1 Zwiebel, gehackt\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "2 EL Olivenöl\n" +
                "400 g Tomaten, gehackt\n" +
                "1 l Gemüsebrühe\n" +
                "50 g geriebener Parmesan\n" +
                "Salz und Pfeffer\n","Erhitzen Sie das Olivenöl in einem Topf bei mittlerer Hitze.\n" +
                "Fügen Sie die gehackte Zwiebel und den Knoblauch hinzu und braten Sie sie für 2-3 Minuten an, bis sie weich sind.\n" +
                "Fügen Sie den Risottoreis hinzu und rösten Sie ihn für etwa 2-3 Minuten, bis er glasig wird.\n" +
                "Fügen Sie die gehackten Tomaten hinzu und lassen Sie sie für etwa 5 Minuten kochen, bis sie weich sind.\n" +
                "Fügen Sie nach und nach die Gemüsebrühe hinzu, bis der Risottoreis al dente ist und die Brühe vollständig aufgenommen wurde (dauert ca. 20-25 Minuten).\n" +
                "Wenn der Risottoreis al dente ist, fügen Sie den geriebenen Parmesan hinzu und rühren Sie gut um.\n" +
                "Mit Salz und Pfeffer abschmecken.\n" +
                "Servieren Sie das Tomatenrisotto heiß, garniert mit frischen Kräutern oder zusätzlichem Parmesan","Vegetarisch/Vegan","Hauptspeise", "Kräftige Rotweine");

        db.add("Schokoladenkuchen", "200 g Zartbitterschokolade\n" +
                "150 g Butter\n" +
                "150 g Zucker\n" +
                "4 Eier\n" +
                "100 g Mehl\n" +
                "1 TL Backpulver\n" +
                "1 Prise Salz\n" +
                "Puderzucker zum Garnieren\n","Heizen Sie den Ofen auf 180°C vor.\n" +
                "Schmelzen Sie die Zartbitterschokolade und die Butter in einer Schüssel über einem Wasserbad, bis sie vollständig geschmolzen sind.\n" +
                "Fügen Sie den Zucker hinzu und rühren Sie um.\n" +
                "Schlagen Sie die Eier einzeln unter, bis sie vollständig eingearbeitet sind.\n" +
                "Sieben Sie das Mehl, Backpulver und Salz in die Schokoladenmischung und rühren Sie gut um.\n" +
                "Gießen Sie den Teig in eine gefettete Springform und backen Sie den Schokoladenkuchen für etwa 30-35 Minuten oder bis ein Zahnstocher sauber herauskommt.\n" +
                "Lassen Sie den Schokoladenkuchen vollständig abkühlen, bevor Sie ihn aus der Form nehmen.\n" +
                "Bestreuen Sie den Schokoladenkuchen mit Puderzucker und servieren Sie ihn mit Schlagsahne oder Vanilleeis.","Vegetarisch/Vegan","Nachtisch", "Kräftige Rotweine");

        db.add("Käseplatte", "4-6 verschiedene Käsesorten (z.B. Brie, Camembert, Cheddar, Gouda, Parmesan, Blauschimmelkäse)\n" +
                "Eine Auswahl an Brot und Crackern (z.B. Baguette, Vollkornbrot, Knäckebrot)\n" +
                "Früchte und Nüsse nach Belieben (z.B. Trauben, Birnen, Äpfel, Walnüsse, Mandeln)\n" +
                "Oliven und eingelegtes Gemüse (z.B. Oliven, getrocknete Tomaten, eingelegte Artischockenherzen)\n" +
                "Honig und Marmelade zum Servieren\n","Legen Sie die Käsesorten auf eine große Platte oder ein Holzbrett und stellen Sie sie in der Mitte des Tisches.\n" +
                "Schneiden Sie das Brot in dünne Scheiben und legen Sie es um die Käseplatte herum.\n" +
                "Legen Sie die Früchte, Nüsse, Oliven und eingelegtes Gemüse um die Käseplatte herum.\n" +
                "Servieren Sie Honig und Marmelade in kleinen Schüsseln auf der Käseplatte.\n" +
                "Lassen Sie Ihre Gäste selbst wählen, welche Käsesorten sie ausprobieren möchten und mit welchen Beilagen sie sie kombinieren möchten.","Vegetarisch/Vegan","Nachtisch", "Kräftige Rotweine");

        db.add("Beeren-Tiramisu", "250 g Mascarpone\n" +
                "250 ml Sahne\n" +
                "3 Eier\n" +
                "100 g Zucker\n" +
                "1 TL Vanilleextrakt\n" +
                "200 g Löffelbiskuits\n" +
                "400 g gemischte Beeren (z.B. Erdbeeren, Himbeeren, Blaubeeren)\n" +
                "100 ml Wasser\n" +
                "1 TL Zitronensaft\n" +
                "Puderzucker zum Garnieren\n","Schlagen Sie die Eier und den Zucker in einer Schüssel mit einem Handrührgerät auf, bis sie dick und cremig sind.\n" +
                "Fügen Sie den Mascarpone und das Vanilleextrakt hinzu und rühren Sie um, bis eine glatte Creme entsteht.\n" +
                "Schlagen Sie die Sahne steif und heben Sie sie vorsichtig unter die Mascarpone-Creme.\n" +
                "Legen Sie eine Schicht Löffelbiskuits auf den Boden einer Auflaufform oder einer Servierschale.\n" +
                "Mischen Sie das Wasser und den Zitronensaft in einer Schüssel und tränken Sie die Löffelbiskuits damit.\n" +
                "Legen Sie eine Schicht Beeren auf die Löffelbiskuits und verteilen Sie eine Schicht der Mascarpone-Creme darauf.\n" +
                "Wiederholen Sie diesen Vorgang, bis alle Zutaten aufgebraucht sind und enden Sie mit einer Schicht der Mascarpone-Creme.\n" +
                "Lassen Sie das Beeren-Tiramisu für mindestens 2 Stunden im Kühlschrank abkühlen, bevor Sie es servieren.\n" +
                "Vor dem Servieren mit Puderzucker bestreuen.","Vegetarisch/Vegan","Nachtisch", "Kräftige Rotweine");

        db.add("Hähnchenbrust mit Gemüse", "4 Hähnchenbrustfilets\n" +
                "1 Zucchini\n" +
                "1 gelbe Paprika\n" +
                "1 rote Paprika\n" +
                "1 rote Zwiebel\n" +
                "2 Knoblauchzehen\n" +
                "2 EL Olivenöl\n" +
                "1 TL Paprikapulver\n" +
                "1 TL getrockneter Oregano\n" +
                "Salz und Pfeffer nach Geschmack\n","Schneiden Sie die Zucchini, die Paprika und die Zwiebel in mundgerechte Stücke.\n" +
                "Schneiden Sie den Knoblauch in feine Scheiben.\n" +
                "Würzen Sie die Hähnchenbrustfilets auf beiden Seiten mit Paprikapulver, Oregano, Salz und Pfeffer.\n" +
                "Erhitzen Sie das Olivenöl in einer großen Pfanne bei mittlerer Hitze.\n" +
                "Legen Sie die Hähnchenbrustfilets in die Pfanne und braten Sie sie 5-6 Minuten auf jeder Seite oder bis sie goldbraun und durchgegart sind.\n" +
                "Nehmen Sie das Hähnchen aus der Pfanne und legen Sie es beiseite.\n" +
                "Geben Sie das Gemüse und den Knoblauch in die Pfanne und braten Sie sie unter gelegentlichem Rühren für etwa 5-7 Minuten oder bis das Gemüse weich und knusprig ist.\n" +
                "Legen Sie das Hähnchen zurück in die Pfanne und erhitzen Sie es zusammen mit dem Gemüse für weitere 1-2 Minuten.\n" +
                "Servieren Sie das Hähnchen mit dem Gemüse und genießen Sie es warm.","Fisch/Fleisch","Hauptspeise", "Leichte Rotweine");

        db.add("Gemüsesuppe", "1 Zwiebel\n" +
                "2 Karotten\n" +
                "2 Stangen Sellerie\n" +
                "2 Kartoffeln\n" +
                "1 Zucchini\n" +
                "1 rote Paprika\n" +
                "1 Liter Gemüsebrühe\n" +
                "1 EL Olivenöl\n" +
                "1 TL getrockneter Thymian\n" +
                "1 TL getrockneter Oregano\n" +
                "Salz und Pfeffer nach Geschmack","Schneiden Sie die Zwiebel, Karotten, Sellerie, Kartoffeln, Zucchini und Paprika in kleine Stücke.\n" +
                "Erhitzen Sie das Olivenöl in einem großen Topf bei mittlerer Hitze.\n" +
                "Geben Sie die Zwiebel, Karotten und Sellerie in den Topf und braten Sie sie unter gelegentlichem Rühren für etwa 5 Minuten oder bis das Gemüse weich wird.\n" +
                "Geben Sie die Kartoffeln, Zucchini, Paprika, Thymian, Oregano, Salz und Pfeffer hinzu und braten Sie sie für weitere 2-3 Minuten.\n" +
                "Geben Sie die Gemüsebrühe hinzu und bringen Sie sie zum Kochen.\n" +
                "Reduzieren Sie die Hitze und lassen Sie die Suppe bei schwacher Hitze für etwa 20 Minuten köcheln oder bis das Gemüse weich ist.\n" +
                "Nehmen Sie den Topf vom Herd und pürieren Sie die Suppe mit einem Stabmixer, bis sie glatt und cremig ist.\n" +
                "Schmecken Sie die Suppe ab und fügen Sie bei Bedarf mehr Salz und Pfeffer hinzu.\n" +
                "Servieren Sie die Suppe heiß und garnieren Sie sie mit frischen Kräutern oder gerösteten Croutons.","Vegetarisch/Vegan","Vorspeise", "Leichte Rotweine");

        db.add("Gebratener Lachs", "4 Lachsfilets, ca. 150-200 g pro Stück\n" +
                "1 EL Olivenöl\n" +
                "1 EL Butter\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "Saft von 1 Zitrone\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "Frische Kräuter (z.B. Petersilie oder Dill), gehackt zum Garnieren\n","Waschen und trocken Sie die Lachsfilets und tupfen Sie sie mit Küchenpapier ab.\n" +
                "Erhitzen Sie das Olivenöl und die Butter in einer großen Pfanne bei mittlerer Hitze.\n" +
                "Geben Sie den gehackten Knoblauch in die Pfanne und braten Sie ihn für 1-2 Minuten an, bis er duftet.\n" +
                "Legen Sie die Lachsfilets in die Pfanne und braten Sie sie für 3-4 Minuten pro Seite an oder bis sie goldbraun und knusprig sind. Wenden Sie den Lachs nur einmal, um ein Auseinanderfallen zu vermeiden.\n" +
                "Geben Sie den Zitronensaft über den Lachs und würzen Sie ihn mit Salz und Pfeffer nach Geschmack.\n" +
                "Garnieren Sie den gebratenen Lachs mit frischen Kräutern und servieren Sie ihn sofort.","Fisch/Fleisch","Hauptspeise", "Leichte Rotweine");

        db.add("Pilzrisotto", "300 g Risottoreis\n" +
                "1 Zwiebel, gehackt\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "300 g gemischte Pilze (z.B. Champignons, Shiitake, Austernpilze)\n" +
                "1 Liter Gemüsebrühe\n" +
                "2 EL Olivenöl\n" +
                "50 g Parmesan, gerieben\n" +
                "2 EL Butter\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "Frische Petersilie zum Garnieren\n","Waschen und trocken Sie die Pilze und schneiden Sie sie in Scheiben.\n" +
                "Erhitzen Sie das Olivenöl in einem Topf bei mittlerer Hitze.\n" +
                "Geben Sie die gehackte Zwiebel und den Knoblauch in den Topf und braten Sie sie für 2-3 Minuten an, bis sie weich sind.\n" +
                "Geben Sie die Pilze in den Topf und braten Sie sie für weitere 5 Minuten oder bis sie weich sind.\n" +
                "Geben Sie den Risottoreis in den Topf und rühren Sie ihn um, bis er mit dem Pilzmischung bedeckt ist.\n" +
                "Geben Sie 1-2 Kellen Gemüsebrühe in den Topf und rühren Sie ständig, bis der Reis die Flüssigkeit aufgenommen hat.\n" +
                "Fahren Sie fort, die Gemüsebrühe schrittweise zu den Risotto zu geben und ständig zu rühren, bis der Reis al dente und cremig ist. Dies dauert etwa 20-25 Minuten.\n" +
                "Wenn das Risotto fast fertig ist, fügen Sie den geriebenen Parmesan und die Butter hinzu und rühren Sie, bis alles geschmolzen ist.\n" +
                "Schmecken Sie das Risotto ab und fügen Sie bei Bedarf Salz und Pfeffer hinzu.\n" +
                "Servieren Sie das Pilzrisotto in tiefen Tellern und garnieren Sie es mit frischer Petersilie.","Vegetarisch/Vegan","Hauptspeise", "Leichte Rotweine");

        db.add("Kichererbsen-Curry", "2 Dosen Kichererbsen, abgetropft und gespült\n" +
                "1 Zwiebel, gehackt\n" +
                "3 Knoblauchzehen, gehackt\n" +
                "1 grüne Paprika, gewürfelt\n" +
                "1 rote Paprika, gewürfelt\n" +
                "1 Karotte, geschält und in kleine Stücke geschnitten\n" +
                "1 Dose gehackte Tomaten\n" +
                "1 Dose Kokosmilch\n" +
                "2 EL Olivenöl\n" +
                "2 EL Currypulver\n" +
                "1 TL gemahlener Kreuzkümmel\n" +
                "1 TL Paprikapulver\n" +
                "1 TL Kurkuma\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "Frischer Koriander zum Garnieren\n","Erhitzen Sie das Olivenöl in einem großen Topf bei mittlerer Hitze.\n" +
                "Geben Sie die gehackte Zwiebel und den gehackten Knoblauch in den Topf und braten Sie sie für 2-3 Minuten an, bis sie weich sind.\n" +
                "Geben Sie die gewürfelten Paprika und die Karotten in den Topf und braten Sie sie für weitere 5 Minuten an, bis sie weich sind.\n" +
                "Geben Sie das Currypulver, den gemahlenen Kreuzkümmel, das Paprikapulver und die Kurkuma in den Topf und braten Sie die Gewürze für 1-2 Minuten an, bis sie duften.\n" +
                "Geben Sie die abgetropften Kichererbsen, die gehackten Tomaten und die Kokosmilch in den Topf und rühren Sie um, bis alles gut vermischt ist.\n" +
                "Bringen Sie das Curry zum Kochen und reduzieren Sie die Hitze auf mittlere Stufe. Lassen Sie es für 10-15 Minuten köcheln, bis das Gemüse weich und das Curry dick und cremig ist.\n" +
                "Schmecken Sie das Curry ab und fügen Sie bei Bedarf Salz und Pfeffer hinzu.\n" +
                "Servieren Sie das Kichererbsen-Curry in Schalen und garnieren Sie es mit frischem Koriander.","Fisch/Fleisch","Hauptspeise", "Leichte Rotweine");

        db.add("Linsensuppe", "200 g rote Linsen\n" +
                "1 Zwiebel, gehackt\n" +
                "2 Knoblauchzehen, gehackt\n" +
                "2 Karotten, geschält und in kleine Würfel geschnitten\n" +
                "2 Stangen Sellerie, in kleine Würfel geschnitten\n" +
                "1 Dose gehackte Tomaten\n" +
                "1 Liter Gemüsebrühe\n" +
                "1 TL gemahlener Kreuzkümmel\n" +
                "1 TL Paprikapulver\n" +
                "1/2 TL gemahlener Ingwer\n" +
                "1/4 TL Cayennepfeffer\n" +
                "2 EL Olivenöl\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "Saft von 1/2 Zitrone\n" +
                "frische Petersilie zum Garnieren (optional)\n","Erhitzen Sie das Olivenöl in einem großen Topf bei mittlerer Hitze. Geben Sie die gehackte Zwiebel, den gehackten Knoblauch, die gehackten Karotten und den gehackten Sellerie in den Topf und braten Sie sie unter gelegentlichem Rühren für etwa 5 Minuten an, bis das Gemüse weich ist.\n" +
                "Fügen Sie die gehackten Tomaten, die Gemüsebrühe, die roten Linsen, den gemahlenen Kreuzkümmel, das Paprikapulver, den gemahlenen Ingwer und den Cayennepfeffer hinzu. Rühren Sie um, um alle Zutaten zu vermischen.\n" +
                "Bringen Sie die Suppe zum Kochen, reduzieren Sie die Hitze auf niedrig und lassen Sie die Suppe für 20-25 Minuten köcheln, bis die Linsen weich sind.\n" +
                "Schmecken Sie die Linsensuppe ab und fügen Sie bei Bedarf Salz und Pfeffer hinzu.\n" +
                "Geben Sie den Saft von 1/2 Zitrone hinzu und rühren Sie um.\n" +
                "Servieren Sie die Linsensuppe in Schalen und garnieren Sie sie mit frischer Petersilie (falls gewünscht).\n","Vegetarisch/Vegan","Vorspeise", "Leichte Rotweine");

        db.add("Gegrilltes Hähnchenschenkel", "8 Hähnchenschenkel\n" +
                "3 Knoblauchzehen, gehackt\n" +
                "1 TL Paprikapulver\n" +
                "1 TL Kreuzkümmel\n" +
                "1 TL Salz\n" +
                "1/2 TL schwarzer Pfeffer\n" +
                "1/4 Tasse Olivenöl\n" +
                "Saft von 1 Zitrone\n","In einer Schüssel den gehackten Knoblauch, das Paprikapulver, den Kreuzkümmel, das Salz, den schwarzen Pfeffer, das Olivenöl und den Zitronensaft vermischen.\n" +
                "Die Hähnchenschenkel in die Schüssel legen und mit der Marinade bedecken. Mindestens 1 Stunde oder über Nacht im Kühlschrank marinieren lassen.\n" +
                "Den Grill auf mittlere Hitze vorheizen.\n" +
                "Die Hähnchenschenkel auf den Grill legen und für etwa 25-30 Minuten grillen, dabei gelegentlich wenden, bis sie goldbraun und knusprig sind und eine Innentemperatur von 74°C erreicht haben.\n" +
                "Vor dem Servieren 5 Minuten ruhen lassen.\n" +
                "Mit Beilagen Ihrer Wahl servieren.","Fisch/Fleisch","Hauptspeise", "Leichte Rotweine");

        db.add("Mediterraner Salat", "1 Kopf Römersalat\n" +
                "1 rote Zwiebel, in dünne Scheiben geschnitten\n" +
                "1 rote Paprika, entkernt und in dünne Streifen geschnitten\n" +
                "1 gelbe Paprika, entkernt und in dünne Streifen geschnitten\n" +
                "1/2 Gurke, geschält und in dünne Scheiben geschnitten\n" +
                "1/2 Tasse Kalamata-Oliven\n" +
                "1/2 Tasse Feta-Käse, zerbröckelt\n" +
                "1/4 Tasse frische Petersilie, gehackt\n" +
                "1/4 Tasse frischer Basilikum, gehackt\n" +
                "Dressing:\n" +
                "\n" +
                "1/4 Tasse Olivenöl\n" +
                "3 EL Rotweinessig\n" +
                "1 Knoblauchzehe, gehackt\n" +
                "1 TL Dijon-Senf\n" +
                "1 TL Honig\n" +
                "Salz und Pfeffer nach Geschmack\n","Den Römersalat waschen und in mundgerechte Stücke schneiden. In eine Salatschüssel geben.\n" +
                "Die rote Zwiebel, rote und gelbe Paprika und Gurke auf den Salat legen.\n" +
                "Die Kalamata-Oliven und den Feta-Käse darüber streuen.\n" +
                "Die Petersilie und den Basilikum darüber geben.\n" +
                "Für das Dressing alle Zutaten in eine kleine Schüssel geben und gut vermischen.\n" +
                "Das Dressing über den Salat geben und gut vermengen.\n" +
                "Sofort servieren und genießen.","Vegetarisch/Vegan","Vorspeise", "Leichte Rotweine");

        db.add("Gemüsequiche", "Für den Teig:\n" +
                "\n" +
                "200 g Mehl\n" +
                "100 g kalte Butter, in kleine Würfel geschnitten\n" +
                "1 Ei\n" +
                "1/2 TL Salz\n" +
                "2-3 EL kaltes Wasser\n" +
                "Für die Füllung:\n" +
                "\n" +
                "1 Zucchini, in dünne Scheiben geschnitten\n" +
                "1 Paprika, entkernt und in kleine Stücke geschnitten\n" +
                "1 Zwiebel, fein gehackt\n" +
                "2 Knoblauchzehen, fein gehackt\n" +
                "150 g geriebener Käse (z.B. Gouda oder Emmentaler)\n" +
                "3 Eier\n" +
                "200 ml Sahne\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "etwas Olivenöl zum Anbraten\n","Für den Teig das Mehl und das Salz in einer Schüssel vermischen. Die kalten Butterwürfel hinzufügen und mit den Fingern in das Mehl einarbeiten, bis die Mischung bröselig aussieht.\n" +
                "Das Ei und das Wasser hinzufügen und alles schnell zu einem Teig verkneten. Den Teig zu einer Kugel formen, in Klarsichtfolie wickeln und für 30 Minuten in den Kühlschrank stellen.\n" +
                "Den Backofen auf 180°C vorheizen.\n" +
                "Für die Füllung die Zwiebeln und den Knoblauch in etwas Olivenöl anbraten, bis sie weich sind. Die Zucchini- und Paprikastücke dazugeben und weitere 5 Minuten braten, bis sie weich sind.\n" +
                "Den Teig aus dem Kühlschrank nehmen und auf einer bemehlten Arbeitsfläche ausrollen. Die Quicheform damit auskleiden und die überstehenden Ränder abschneiden.\n" +
                "Die Gemüsemischung auf den Teigboden geben.\n" +
                "In einer Schüssel die Eier und die Sahne gut verrühren. Mit Salz und Pfeffer würzen und die Hälfte des geriebenen Käses hinzufügen. Die Eiermischung über das Gemüse gießen und den restlichen Käse darauf streuen.\n" +
                "Die Quiche im vorgeheizten Backofen für 30-35 Minuten backen, bis sie goldbraun ist und die Füllung gestockt ist.\n" +
                "Aus dem Ofen nehmen und 5 Minuten abkühlen lassen, bevor sie in Stücke geschnitten und serviert wird.","Vegetarisch/Vegan","Vorspeise", "Leichte Rotweine");

        db.add("Fruchtsalat", "2 Äpfel\n" +
                "2 Bananen\n" +
                "1 Mango\n" +
                "1 Ananas\n" +
                "2 Kiwis\n" +
                "1 Handvoll Trauben\n" +
                "1 Handvoll Beeren (Erdbeeren, Himbeeren oder Blaubeeren)\n" +
                "1 Zitrone\n" +
                "1 Esslöffel Honig\n","Schneiden Sie das Obst in mundgerechte Stücke und legen Sie es in eine Schüssel.\n" +
                "Pressen Sie den Saft der Zitrone über den Fruchtsalat.\n" +
                "Geben Sie den Honig darüber und rühren Sie den Salat vorsichtig um.\n" +
                "Bedecken Sie die Schüssel und stellen Sie sie für mindestens eine Stunde in den Kühlschrank, um den Salat kühl zu halten und die Aromen zu vermischen.\n" +
                "Servieren Sie den Fruchtsalat als Dessert oder als Snack.","Vegetarisch/Vegan","Nachtisch", "Leichte Rotweine");

        db.add("Schokoladenkuchen", "100g Zartbitterschokolade\n" +
                "100g Butter\n" +
                "3 Eier\n" +
                "100g Zucker\n" +
                "50g Mehl\n" +
                "1 Teelöffel Backpulver\n" +
                "Prise Salz\n" +
                "Puderzucker zum Bestäuben\n","Heizen Sie den Backofen auf 180°C vor und fetten Sie eine 20cm runde Kuchenform ein.\n" +
                "Schmelzen Sie die Schokolade und Butter in einem Wasserbad oder in der Mikrowelle und lassen Sie sie abkühlen.\n" +
                "In einer separaten Schüssel schlagen Sie die Eier und den Zucker mit einem Handrührgerät auf höchster Stufe, bis die Masse dick und schaumig ist.\n" +
                "Rühren Sie die geschmolzene Schokolade und Butter in die Eimasse.\n" +
                "Sieben Sie das Mehl, Backpulver und Salz in die Schokoladenmischung und rühren Sie es vorsichtig mit einem Spatel um, bis alles gut vermischt ist.\n" +
                "Gießen Sie den Teig in die vorbereitete Kuchenform und backen Sie den Kuchen für 20-25 Minuten im vorgeheizten Ofen.\n" +
                "Lassen Sie den Kuchen in der Form für 10 Minuten abkühlen, bevor Sie ihn aus der Form lösen und vollständig auskühlen lassen.\n" +
                "Bestäuben Sie den Kuchen mit Puderzucker und servieren Sie ihn.","Vegetarisch/Vegan","Nachtisch", "Leichte Rotweine");

        db.add("Gebratene Feigen mit Ziegenkäse", "8 reife Feigen\n" +
                "100g Ziegenkäse\n" +
                "2 Esslöffel Honig\n" +
                "1 Esslöffel Olivenöl\n" +
                "Salz und Pfeffer nach Geschmack\n" +
                "Frische Kräuter wie Thymian oder Rosmarin (optional)\n","Waschen Sie die Feigen, schneiden Sie den Stielansatz ab und halbieren Sie sie längs.\n" +
                "Erhitzen Sie das Olivenöl in einer Pfanne bei mittlerer Hitze.\n" +
                "Legen Sie die Feigen mit der Schnittseite nach unten in die Pfanne und braten Sie sie für etwa 2-3 Minuten, bis sie goldbraun sind.\n" +
                "Wenden Sie die Feigen um und braten Sie sie auf der anderen Seite für weitere 1-2 Minuten.\n" +
                "Schneiden Sie den Ziegenkäse in kleine Würfel.\n" +
                "Legen Sie den Ziegenkäse auf die Schnittfläche jeder Feigenhälfte.\n" +
                "Träufeln Sie den Honig über die Feigen und den Ziegenkäse.\n" +
                "Würzen Sie die Feigen mit Salz und Pfeffer und streuen Sie optional einige frische Kräuter darüber.\n" +
                "Braten Sie die Feigen für weitere 2-3 Minuten, bis der Ziegenkäse weich und leicht gebräunt ist.\n" +
                "Servieren Sie die gebratenen Feigen sofort als Vorspeise oder Beilage zu einem Hauptgericht.","Vegetarisch/Vegan","Vorspeise", "Leichte Rotweine");

        db.add("Mandelkuchen mit Orangensirup", "125g weiche Butter\n" +
                "125g Zucker\n" +
                "2 Eier\n" +
                "125g gemahlene Mandeln\n" +
                "50g Mehl\n" +
                "1 TL Backpulver\n" +
                "1 Prise Salz\n" +
                "Zutaten für den Orangensirup:\n" +
                "\n" +
                "100 ml Orangensaft\n" +
                "50g Zucker\n" +
                "1 EL Orangenlikör (optional)\n" +
                "Zutaten für die Garnitur:\n" +
                "\n" +
                "1 Orange\n" +
                "1 EL gehackte Mandeln\n" +
                "Puderzucker zum Bestäuben\n","Den Ofen auf 180°C vorheizen. Eine 20 cm Kuchenform einfetten und mit Mehl bestäuben.\n" +
                "Butter und Zucker mit einem elektrischen Mixer cremig schlagen.\n" +
                "Die Eier nacheinander unterrühren, bis eine glatte Masse entsteht.\n" +
                "Die gemahlenen Mandeln, Mehl, Backpulver und Salz in einer separaten Schüssel vermischen.\n" +
                "Die trockenen Zutaten nach und nach zur Eimischung geben und gut vermengen.\n" +
                "Den Teig in die vorbereitete Kuchenform geben und glatt streichen.\n" +
                "Den Kuchen 30-35 Minuten im Ofen backen, bis er goldbraun und durchgebacken ist.\n" +
                "Währenddessen den Orangensirup zubereiten: Orangensaft und Zucker in einem Topf erhitzen und zum Kochen bringen. Dann bei niedriger Hitze köcheln lassen, bis der Zucker vollständig aufgelöst ist. Orangenlikör hinzufügen (wenn gewünscht).\n" +
                "Den Kuchen aus dem Ofen nehmen und 5 Minuten in der Form abkühlen lassen. Dann aus der Form nehmen und auf ein Gitterrost legen.\n" +
                "Den Orangensirup über den Kuchen gießen, so dass er vollständig von dem Kuchen aufgenommen wird.\n" +
                "Die Orange schälen und in dünne Scheiben schneiden.\n" +
                "Den Kuchen mit den Orangenscheiben belegen, mit gehackten Mandeln bestreuen und mit Puderzucker bestäuben.\n" +
                "Den Kuchen servieren und genießen.","Vegetarisch/Vegan","Nachtisch", "Leichte Rotweine");

        return (db);
    }
}
