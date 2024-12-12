package day12

object Day12Input {

    val testInput = """
        AAAA
        BBCD
        BBCC
        EEEC
""".trimIndent()

    val testInput2 = """
        RRRRIICCFF
        RRRRIICCCF
        VVRRRCCFFF
        VVRCCCJFFF
        VVVVCJJCFE
        VVIVCCJJEE
        VVIIICJJEE
        MIIIIIJJEE
        MIIISIJEEE
        MMMISSJEEE
""".trimIndent()

    val testInput3 = """
        OOOOO
        OXOXO
        OOOOO
        OXOXO
        OOOOO
    """.trimIndent()

    val testInput4 = """
        AAAAAA
        AAABBA
        AAABBA
        ABBAAA
        ABBAAA
        AAAAAA
    """.trimIndent()


    val prodInput = """
        KKKKKKCVCCCCCCEEEEEEJJJJJJJJLLLLLLLLYYJJJJJJJJTGJJGGGWWWZZZZZZGGGGGGGJJZZZZZZTTTTTTTAAAAAAAAAUUUUGGGZZZZZZZSSSSSSSSSHHHHHHHHHPPPRRRRGGGGGGGG
        KKKCCCCCCCCCCCEEEEEEEJJJJJJLLLLLLLLLYYYJKJJTTTTGGGGGGWWWGZZZZZZZGGGGCZZZZZZZZZTTTTTTAAAAAAAAAUUUUUUUZZZZZZSSSSSSHSSSHHHHHHHHHPPPRRRRRGGGGGGG
        KKKCCCCCCCCCCCCEEEEEEJJJJJJLLLLLLLLLLLLKKJJTTTTGGGGGWWGGGGZZZZZGGGGGCZZZZZZZZZTTTTTAAAAAAAAAUUUUUUUUXZZZZZSSSSSSHHHHHHHHHHOOHHPRRRRRRGGGGGGG
        KCKCCCXCCCCCCCCCCEEEEJJJJJJLLLLLLLLLLLLTTTTTTTTGGGGGGGGGGZZZZRZRGGJGCZMMMMZZZTTTTTTAAAAVAVVAAUUUUDUUZZZZZKBBBSHHHHHHHHHHHHOOOPPRRRRRRGGGGGGG
        KCCCCCCCCCCCCCCCCEEEEEJJJJLLLLLLLLLLLLLTTTTTTTTTGGGGGGGGGZZZRRRRRGRRZZMMMMZZZTTTTTTTAAAVVVVUUUUUUUUUUZZZZZPBVBBBPHHHHHHHHHOOOPPRRRRRRRRGGGSG
        KKQQQQCCCCCCCCCCCEEEEJJJJLLLLLLLLLLLLRLTTTTTTTTTMGGGGGGNGZZZRRRRRRRRMMMMMMMMMTTTTTTTAAAAVVVUUUUUUUXZZZZBZZZBBBBPPHHHHHHHHHHHOOHHRMRRRRRGGGGG
        KKQQQQCCCCCCCCCCEEEEEECCZZZLLLLLLLLLRRTTTTTTTTTTMMMMGGNNZZZZRRRRRRRRMMMMMMMMMTTTTTAAAAAAVVVHHHHUUZZZZZZBBBBBBBGGGMHHHHHHHHHHOOHHMMMRMRRGGGRR
        KQQQQQCCCCCCCCCEEEEEEEEEZZZLLLLLLLLLMTTKTTTMMBTTTMYYIGNNNNZZRRRRRRRRMMMMMMMMMTTTTTTMMAHAVVVHHHHUUUZZZZZBBBBBBGGGGGHHHHHHHHHHHOHSMMMMMMRRRRRR
        QQQQQQQCCCCCCAAEELEEEZZZZZZLLLLLLLMMMMTTTTMMMTTTMMYYYYYYNNYZZRRRRRRRRRMMMMMMMTTTTMMMMHHVVVVVHHHHHZZZZBBBBBGBBGGGGGHHHHHHHHHHHHHMMMMMMRRRRRRR
        XQQQQQQQCCNCCADDDDEEEZZZZZZLLLLEEMMMMMMTTTMMMTTTMMYYYYYYYNYYDYGRRRRRRRMMMMMMMMTTTTMMMHHHHHHVHHHHHZHZZZBBBBGGGGGGGGHHHHHHHHHLHHHMMMMMMRRRRRRR
        XQQQQQQQQCCCCAADFFFFFZZZZZLLLLLEMMMMMMMMMMMMMTTTMYYYYYYYYYYYYYYRRRUUUUUUUUUMMMMTTMMMMHHHHHHHHHHHHZHHZZBYGGGGGGGGGHHHHHHHLLLLLLHKMMMMMRRRRRRR
        QQQQQQQQQQCCAADDDFDFFZZZZLLLOMMMMMMMMMMMMMMMTTIMYYYYYYYYYYYYYYYRRRUUUUUUUUUMMMMMMMMMMMHHHHHHHHHHHHHHYYYYYYGGGGGGGGHLLLLLLLLLLIMKMMMMRRRRRRRR
        QQQQQQQQQQDDDDDDDDDFFDDDNNNNOOMMMMMMMMMMMMMMMMMMMYYYYYYYYYYYYYRRRRUUUUUUUUUMMMMMMMMMMMHHHHHHHHHHHHHHYYYYYYGGGGGGGGGLLLLLLLLLLIMMMMMMRRRRRRRR
        QQQQQQQQQQAADDDDDDDFFDDDNOOOOOMTTMMMMMMMMMMMMMMMMYYYYYYYYYYYUUUUUUUUUUUUUUUMMMMMMMMMMMHHHHHHHHHHHHHHYYYYYYGGGGGGGGGGLLLLLLLLOIMMMMMMRRRRRRRR
        QQQQQQQQQQADDDDDDDDDDDDDNOOOOOOOTTYYMYMMMMMMMMMMYYYYYYYYYYYYUUUUUUUUUURIUMMMMMMMMMMMMMMHHHHHHHHHHHHYYYYYYYYGGGGGGGGGGLLLLOOOOIIMRRRRRRRRRRRR
        QQQQQQQQQQDDDDDDDDDDDDDDDDOOOYYOYYYYYYMMMMMMMMMMMYYYYYYYYYYYUUUUUUUUUUUIUUUMUMUMMMMMMMMHHHHHUHHHHHHHYYYYYGGGGGGGGGGGGWLLOOOOOOMMMRRRRRIIRRRR
        QQQQQQQQQBBDRDDDDDDDDDDDEEEEEYYKKYYYYYMMMMMMMMMMBYYYYYYYYYYYUUUUUUUUUUIIUUUUUUUMMMMMMMMHHHUUUUUUUHHHGGGGGGGGGGGGGGGGGWLOOOOOOOMMMRRIRIIRRIII
        QQQQQQQWWBBDDDDDDDDDDDDDDDDEYYYYYYYYYYMMMMMMMMMBBBYYYYYYYYYYUUUUUUUUUUUUUUUUUUUMMMMMMMHHHHUUUUUUUUUUUGGGGGGGGGGGGGWGGOOOOOOOOOIMRRIIIIIIIIIC
        QQQQQQWWWWBDDDDDDDDDDDDDEEEEYYYYYYYYYYYMMMMMMMBBBBBYYYYYYYYUUUUUUUUUUUUUUUUUUUUMMMMMMMHHHHUUUUUUUUUUUUGGGGGGGGGGGGWGGWWWOOOOOORRRIIIIIIIIICC
        QQQQQQQWWWBBDDDDDDDDDDDDDEEYYYYYYYYYYYYMMMMMMMBBBBBBBYBYYYYUUUUUUUUUUUUUUUUUUUUMMMMMMMHHHHUUUUUUUUUVUUGGGGGGGGWWWWWWWWWWWWWOORRRRRRIIIIIIIIC
        FFFQQQQWWWBBDDBBBDDWDPDWDEEEYYYYYYYYYYYMMMMBBBBBBBBBBBBBBYYUUUUUUUUUUUUUUUUUUUUMMMMMMMHHHHAAUUUUUUIUGGGGGGGGGGGGWWWWWWWWWWWOYYRRRRMIIIITIRRC
        FFFQQQQWWWBBDDBBEEDWWWWWWWYYYYYYYYYYYYBMMMBBBBBBBBBBBZBPPPPPPPPPUUUUUUUUUUUUUUUPMSMMNMHHHHHHUUUUUUUUGGGGGGGGGGGGGGWWWWWWWWWOOYYYYRMIIIITRRRC
        FFFQLQQQWWBBBBBBEEWWWWWWWWYYYYYYYYYYYYBBBBBBBBBBBBBZZZZZPPPPPPPPUUUUUUUUUUUUUUUMMMMMPPHHHHHUUUUUSUUUGGGGGGGGGGGGGGWWWWWWWWWYYYYYRRRIIIIRRRUR
        FFFFFFFWWWWBBBEBEEEWWWWWYYYYYYYYYYYYYYBBBBBBBBBBBBBZZZZZPPPPPPPPUUUUUUUUUUUUUUUPPPPPPPPEHHUUUUUHUUUUJGGGGGGGGGGGGGWWWWWWWWWYYYYYRRRIRRRRRRRR
        OOOOOOOOWWWBBEEEEEWWWWWWWWWYYYYYYYYYYBBBBBBBBBPPPPZZZZZZZPPPPPPPUUUUUUUUUUUUPPPPPPPPPPPEHHUGUUHHHHUUGGGGGGGGGGGGGWWWWWWWWWWYYRRRRRRRRRRRRRRR
        OOOOOOOOBBBBBEEEEEEWWWWWWWWWWMYYYYYYYGBWWWWBBBPZZZZZZZZZZPPPPPPPUUUUUUUUPUUUPPPPPPPPPPPHHHUUUUUUHHUHGGGGGGGGGGGGGGWWWWWWWWWWRRRRRRRRRRRRRRRR
        OOOOOOOOOOOOOTEEEEEWWWWWWWWWWWYYZYYYYYYWWWWWBBPZZZZZZZZZZZZPPPPPUUUUUUUUUUUUUUUUUPPPPXPPHUUUUUUHHHHHGGGGGGGGGGGIWWWWWMMWWWWCCRRRRRRRRRRRRRRR
        OOOOOOOOOOOOOOOMEEEWWWWWWWWWWWWWWWEYYYYWVWWWWWPZZZZZZZZZZZZPPPPPUUUSUUUUUUUUUUUUUPPPPPPPNUUUUUUHHHHHHGGGGGGGGGIIIWWWWWMMMWWRRRRRRRRRRRRRRRRR
        OOOOOOOOOOOOOOOOEEEEWWWWWWWWWWWWWWEYYYWWVVWWWWPZZZZZZZZZZZZPPPPPUUSSSSUUUUUUUUUUUPPPPPPNNUUUUUUHHHHHHGGGGGGGGGIIWWWWWWMMMMMRRRRRRRRRRRBRRRRR
        OOOOOOOOOOOOOGOEEEEEWEEWWWWWWWWWWWWZYYYVPPPPPPPZZZZZZZZZZZZPPPPPDUSSSSSSUUUUPPPPPPPPPPPNNNNUUUUHHHHHHGGGGGGGGGIIWWWWMMMMMMMRRRRRRBBRRBBBRRBB
        OOOOOOOOOOOOOOEEEEEEEEEZWWWWWWWWWWWWWYMVPPPPPPPZZZZZZZZZZZZUUUUUDDDSSSSSSUUUPPPPGPPPPPNNNNNUUHHHHHHHHGDDDDGGGZZZZWWMMMMMMMMRRRROROBBBBBBBBBB
        OOOOOOOOOOOOOEEEEEEEEZVVVVVVVVVWWVVVVVVVPPPPPPPZZZZZZZZZZBBBBBUUDDDDSSSSSUUUPPPPGIIIIIIHNNUUHHHHHHHHGGDDDDGGGZZZZWWMMMMMMMMMMMOOOOOBBBBBBBBB
        OOOOOOOOOOOOOEEEEEEEZZVVVVVVVVVWWVVVVVVVPPPPPPPZZZZZZZZZZBBBBWDUDDDDDSSSSUUUPPGGGIIIIIIHNNNUUHHHHHHHDDDDDDDGGZZZZMMMMMMMMMMMMMMOOOOBBBBBBBBB
        BBBBOOOOOOOOOOOOZZZZZZVVVVVVVVVWWWVVVVVVPPPPPPPPPPBBBBBBBBBBBDDDDDDDSSSSSUUUCAGGGIIIIIIHHHHHHHHHHHDDDLDZZDDGZZZZZMMMMMMMMMMOMOOOOBBBBBBBUBBB
        BBBBOOOOOOOOOOOOUZZZZZVVVVVVVVVWWWWVVVVVPPPPPPPPPPBBBBBBBBBBBDDDDDDDSSSSAUUUAAGGGGIIIIIHHHHHHHHHHHDDDDIZZZZGZZZZZZZZMMOMMMMOOOOOEELBBBBMUUBB
        BBBBOOOOOOOOOOOOZZZZZZVVVVVVVVVWWWWVVVVVPPPPPPPPPPBBBBBBBBBBBDDDDDDDDDDSAUUUAAGGGGIIIIIHHHHHHDDDHHDDDDDZZZZZZZZZZZZZGGOOOOLOOOOOOELLLBDUUUBU
        BBBBOOOOOOOOOOOOZZZZZZVVVVVVVVVWWWWWVVVVPPPPPPPPPPBBBBBBBBBBBDDQDDDDDDTAAUUUAAAGGGIIIIIHHHHHHDDDDDDDDLLLZZZZZZZZZZZGGOOOOOOOOOOOEELELLUUUUUU
        BBBBOOOOOOOOOOOOZZZZZZVVVVVVVVVWWWVVVTVVVVVVVVVLLLLBBBBBBBBBBBBBTTTTTTTLLAAAGGGGGGIIIIIVDDDDDDDDDDDDDLLLZZZZZZZZZZZOOOOOOOOOOOOOEELELLLUUUUU
        BBBBOOOOOOOOOOOOZZZZZZZZZZZWWWWWWWVVVTTVVVVLLLLLLLLBBBBBBBBBBBNNTTTTTTLLAAAAAGGGFFIIIIIDDDDDDDDDDDDDDLLLNZZZZZZZZUUOOOOOOOOOLLLOEEEEELLLLUUU
        BBBBOOOOOOEEEZZZZZZZZZZZZZZWWWWWWWBWTTTVVVVLYLLLLLBBBBBBBBBBBBNTTTTTTTTLLLAAAGGGFFIIIIIFDDDDDDDDDDDDDDDDNZNZZNZZZZUUUUOOOOOOOZLEEEEEEELLLULU
        BBBBOOOOOOEEEVZZZZZZZZZZZZNWWWWWWWWWTTTTVVVLYYYYYLBBBBBBBBBBBBTTTTTTTTTLLLLLAGGFFFFFFFFFDDDDDDDDDDDDDDDNNNNNNNZZRZUUOOOOOOOOOLLREEEEELLLLLLU
        BBBBBBVOVVVNNVKZZZZZZZZZZZNNWWWWWWWWWTTTTYVVYYYYYLBBBBBBBBBBBBBTTTTTTTTLLLLLLTTTFFFFFFFFDDDDDDDDDDDDDDDDNNNNEEEZZUUUOOOOOOOLLLLLEEEEEEELLLLU
        BBBBBVVOVVVVVVZZZZZZZZZZZZZNWWWWWWWWTTTTTYYYYYYYYLLLLWWWBBBBBBMMTMTTTTTLLLLLLTTTFFFFFFFFDDDDDDDDDDDDDDDNNNNNEEEEEUUUOGOLLLOLLLLLHEEEEEELLLLU
        BBBBBVVVFVVVVVVVZZZZZZZZRRZNWWWWWWWWWTTTYYYYYYYYYLLLLWWWWWBBBMMMMMMTTTTLLLLLTTTTFFWWFFEFDDDDDDDDDDDDDDNNNNNEEEEEEEUEOOOLLLLLLLLLEEEEEEELLULU
        CCBBBBVVVVVVVVVVVKKCZZZRRRVVVVWVVWWWWKTTTTTYYYYYYLLLWWWWWWWWWWWMMMMWWLTLLLLTTTTTTUTWWWEEEEDDDVDDDDDDEETTNNEEEEEEEEEEESLLSLLLLLLEEEEEEEEEEEEU
        CCCCBUUUVVVVVVVVVKKCZZRRRCVVVVVVWWWWEKKTTTYKYYYYYWWWWWWWWWWWWWWWWWWWWLLLLLLTTTTTTTTWWWEEEEEDEEDSSDDDETTTEEEEEEEEEEEEESSSSSLLLLLLLEEEEEEEUUUU
        CCCCCVVVVVVVVVCPCCCCCZCCCCCVVVVVWWVEEKKKKTYYYYYYYYWWWWWWWWWWWWWWWWWWWWLLLLTTTTTTTTTWWWWEEEEEEESSDDDDDTZTEOEEEEEEEEEEEEEEVSLLLLLLLLEEEEEEUUUU
        CCCCCCCVVVVVVVCPCCCCCCCCCCHCVVVVVVVKKKKKTTYYYYYYYYYYWWWWWWUUWWWWWWWWWUQLLQQJTTTWWTTTWWWEEEEEEEESSSSSDTTTTEEEEEEEEEEEEEEEVVLLLLLLLLEEEEUUUUUU
        CCICCCCVVVVVVVCCCCCCCCCCCCCCCVVVVVVKKKKKKEYYYYYYYWWWWWWSSSSUWWWWWWWWGQQQQQQQQTTWWTWWWWEEEEEEEEESSSTTTTTTTIIEEEEEEEEEEAEVVVVNLLLLEEEEUUUUUUUU
        CCICCCCVVVVVVVCCCCCCCCCCCCCCCVVVVVVVVKKKEEEYYYYYYYYWWWSSSSSUWWWWWWWWWWQQQQQQTTTTWWWWWWWEEEEESSSSSSTTTTTTIIIIEEEEEEEEEVVVVPNNLLLLLUUUUUUUUUUU
        IIIICCCCVVVVVCCCCCCCCCCCCCHHVVVVVVVVKKKKEEEEYYYYYYYYSASSSSSSWWWWWWWWQQQQQQQQQQQQQWWWWWWEEEESSSSSSSSTTTTIOIIIIEEEEEEEEEVVVPPNLLULUUUUUURRRRRR
        IIIIIICVVVVVCCCCCCCCCCCCCCCVVVVVVVVVVKKEEEEEYYYYYYYZSSSSSSSSSWWWWWWWQWQQQQQQQQQQQQWWWWWEESSSSSSSSSTTTDIIIIIIIEIEEEEDELPVPPPRRUUUUUUUUUURRRRR
        IIIIIIVVVVFOCCCCCCCCCCCCCCVVVVVVVVVVVNEEEEEEYYYYYYYSSSSSSSSSSTWWWWWWWWWWQQQQQQQQQQWWWWWWESSSSSTSSSSTDDDRIIIIIIIIEEEEELPPPPPRRRRUUUUUUURRRRRR
        IIIIIVVVVFFFCCCCCCCCCCCCNBHVVVVVVVVVVNEEEECCYCRRYRRSSSSSSSSSBSWWWWWWWWWWWMQQQQQQQQQRRRRRESSSSSTTSSSSIDDDIIIIIIIEEEEEEEPPPPRRRRRUUFFUFFRRRRRR
        IIIIIVVVVTFFCFCCCCCCCCCNNBHHHHVVVVVVNNNNNNCLCCRRRRRRSSSSSHHHHHHWWWWWWWWWMMMQQQQQQQRRRRRRSSTTTSTTSSSSIDLDIIIIIIIIEEEEPEPPRRRRRRRUUFFFFRRRRRRR
        IIIIIIFVVVLFFFFCCCCCCCCNBBBBVVVVVVVVNNNNCNCCCCCCRRRSSSSSSHHHHHHJWWWMWWWMMMMQQQTQQQRRRRSSSSTTTTTTTSSSIDDDIIIIIIIIIEEEPPPPPRRRRRRRRFFFFFRRRRRR
        IIIIIIFFVFFFFFFCCFCCCVVBBBBBBBVVHVVNNNCCCCCCCCCCRRRSSSHHHHHHHHHJWWWMSWWMMMMMQQTQRRRRRRSSSSTTTTTTSSIIIIIIIIIIIIIPPPPPPPPPPRRRRRRRFFFFFFRRRRRR
        IIIIIFFFFFFFFFFFFFCCCCBBBBBBBBBBBBBBCCCCCCCCCCCCRRRSSSHHHHHHHHHJWWWMMMMMMMMTTTTIITRRRRRRTTTTTTTTIIIIIIIIIIIIIIIPPPPPPPPPPRRRRRRRRFFFFFRRRRRR
        IIIIIIFFFFFFFFFFFFCCCYYYBBBBBBBBBBBBCCCCCCCCCCCCRSRSSSHHHHHHHHHJWWWMMMMMMMTTTTTTTTTRRRDDTZTTTTTKCIIIIIIIIIIIIIIPPPPPPPPPRRRRRRRRFFFFRRRRRRRR
        IIIFFFFFFFFFFFFFFFFCCYYYBBBBBBBBBBBCCCCCCCCCCCCCSSSSSSHHHHHHHHHOOMMMMMMMMMMMTTTTTTVVRMDZZZZTKKKKKIIIIIIIIIIIIIIPPPPPPPPPRRRRRRRRFWFRRRRRRRRR
        NIISSFFFFFFFFFFFFFFCCYYYBBBBBBBBBBCCCCCCCCCCCCSSSSSSSSHHHHHHHHHOOOMMMMMMMMMMMJJJJJJJJMDZZZZZZKYKKIIKKIIIIIIIIIIPPPPPPPPRRRRRRRRRFFFRRRRRRRRR
        NTTTSFFFFFFFFFFFFFCCCYYYBBBBBBBBBBBCCCCCCCCCCCSSSNSNSSHHHHHHHHHOOOMMNMMMMMMMMJJJJJJJJMMZZZZZZZKKKIIKKKIIIIIIIIIIPPPPPPPPRRRRRRRRRRRRRRRNNRRR
        TTTTSFFFFFFFFFFFFFFCYYYYYBBBBBBBBBBBCCCCCCCCCCCCNNNNNNHHHHHHHHHOOONNNMMMMMMMMJJJJJJJJMMMMMZZZKKKKKKKKKKIIIIIIIPPPPPPPPPRRRRRRRRRRRRRRNNNNNRR
        TTTTSTTVVFFFFFFFFFFYYYYYBBBBBBBBBBBBCCCICCCCCNNNNNNNNSHHHHHHHHHONNNNNNNNNMMMJJJJJJJJJMMMZZZZKKKKKKKKKKKIIIMMPPPPPPPPPPPPRRRRUURRRRRRRNNNNNNJ
        TTTTTTFVVFFFFFFFFFFYYYBBBBBBBBBBBBBBBBIICCCCCNNXXXNNNNHHHHHHHHHOONNNNNNNNMMMMMMVMMMMMMMMZZZZZZZKKKKZKKKIIMMMMPPPPPPPPPRRRRRRUURRRRHRNNNNNNNN
        GTTTTTTVVFFFFFFFFFFFWWWUBVBBBBBBBBBBIIIIICCCCCNXXXNXNNHHHHHHHHHOOXNNNNNNNNMMMEMVMMMMMMMMMZZZZZZKZKKZKKKIIMMMMMPPPPPPPPRRRRRUUURRRRNNNNNNNNNB
        GTTTTVVVVFFFFAAAWWWWWWWWWVBBBBBBBBIIIIIIITCCCXXXXXXXXNNHHHNNNOOONXNNNNNNNMMMEEMMMMMMMMMMMZZZZZZZZZZZKZZZMMMMMMPPPPPPPPPZZRZZUUUUVRNNNNNNNNNN
        TTTTTTVVVVBBFAAAAAAWWWWWWBBBBBBOZZZIZIIIITQCCCXXXXXXXNNNNNNNNOOONNNNNNNNNNEEEMMMMMMMMMMMMMZZZZZZZZZZZZZZMMMMMMMMPPPPPPPPZZZUUUUUVVNNNNNNNNNN
        TTTTTVVVVVBBFFAAAAAAAWWWWAABBBZZZZZZZIIIITTEEEXXXXXNNNNNNNNNNNNNNNNNNNNNNEEEEEEMMMMMMDMDMMZZZZZZZZZZZZZZMMMMMMMMUUUPPPPPZZZUUUUUUVVNNNNNNNNN
        TTTTVVVVVBBEEEAAAAAAWWWWWAAZBBZZZZZZZIIIITIIEUUXXXXNNNNNNNNNNNNNNNNNNNNNNEEEEEEEMMMMDDDDDZZZZZZZZZZZZZZZMMMMLMMMUUUUPPPPUZZUUUUUUUNNNNNNNNNN
        TTETVVVVVBBBEEEEEAAAAAWAAAAZZZZZZZZZZIIIIIIEEEUXXXXENENNNNNNNNNNNNNNNNNNNEEEEEEEMMDDDDDDZZZZZZZZZZZZZFFFLLLLLMMMUUUUPPPUUZZCUUUUUUNNNNNNNNNN
        TPVVVVVVVBEEEEEEAAAAAAAAAAAZZZZZZHHHHZYYYIIEEEEOXXEEEENNNNNNNUUJNNNNNNNNNNNEEEEEEDDDDDDDDDZZZZZZZZZZZFFFFLLLLMMUUUUUUUUUUZZCUUUUUUUNNNNNNNNN
        PPVVVVVVVVEEEEEEAAAAAAAAAAAAZZZHHHHHHHYYYIUEEEEXXXXEEENNEENNUUUUUUNVVNNENNNEEEEEEEEDDDDDDDZZZZZZZZZZFFFFFFLLLLMMUUUUUUUUCCZCUUUUUUUUUNNNNNNN
        LPPVVVVVVLLLHHEEAAAAHHHHAAHZZZZHHHHHHHYYYYUUEEEEXXXEEEEEEENUUUUUUUNNNNEEEEEEEEEEEEENDDDDDDSZZZZZZZZZFFFFLLLLLLMUUUUUUUCUCCCCCCUUUUUCNNNNNNNN
        LLPVLVVLLLLLLLQYAAAHHHHHHAHZDZHHHHHHHHMYUUUEEEEEEEEEEEEEEEUUUUUUUUUUUEEEEEEEEEEEEEENNDDDDDZZZZZZZZZZZFFFLLLLLLLUUUUUUUCCCCCCCCUUUUUUUUNNNNNN
        LLNNLLLLLLLLLLYYYYHHHHHHHHHHZZHHHHHHHHMMUUUUUUUUEEEEEEEEEUUUUUUUUUUUUUEEEEEEEEEEEENNNNDDDDZDDZZZZZZZFFFFLLLLLLUUUUUURULCCCCCCCCUUUUUUUUNNNNN
        LLNNNLLLLLLLLYYYYYYHHHHHHHHHZZHHHHHHHHUUUUUUUUYUEEEEEEEEEEUUUUUUUUUUUUEEEEEEEEEEOENNNNNNDDDDDZZZZZZFFFLLLLLLLFFSUUULUUCCCCCCCCCCUUUUUUUNNNNN
        LLNZZLLLLLLLLYYYYYYYHHHHHHHHHHHHHHHHHHUUUUUUUUUUEEEEEEEZEEUUUUUUUUUUDDEEEEAAAOOOOENDDDNDDDDZZZZZZZFFFLLLLLLLLFFSULLLLUCCCCCCCYYCUUUUUULNMNNN
        LLLLLLLLLLLLLLLYYYYYYHHHHHHHHHHHHHHHHHUUUUUUUUEEEEEEFFUUUUUUUUUUUUUUDDDEEEAAAOOOODDDDDDDDDDZZYZZZZZFFLLLLLLLLFFFFLLLLLCCCCCCCCYYYUUUUUUNNNFN
        LLLLLHLLLLLLLLLYYYYYYHHHHHHHHHHHHHHHHHUUUUUUUUEUQEEEUUUUUUUDDDUUUUDDDDDEEEAAAOOOODDDDDDDDDDZZYZZZFFFFFFLLLLLFFFFFFLFLLLCWUCCCYYYYUUUUFNNNFFF
        LLLLLHLLLLLLLLYYYYYYYYYHHHHHHGGGGGGGGGUUUUUUUUUUUEEUUUUUUUUDDDUUDDDDDDEEEEAAAOOOODDDDDDDDDDDWWWHWFFWWWWLLLHLLLFFFFFFFFLCWWWZCYYYUUUUFFFFFFFF
        LLLLLNLLLLLLLLYYYYYYYYYYHHHHHGGGGGGGGGUUUUUUUUUUUUZUUUUUUUDDDDDDDDAAAAAAAAAAAOOOODDDDDDDDDDDDDWWWWFWWWVVHHHHLLHFFFFFFFLLWWWWWWYYUUUUFFFFFFFF
        LZLNNNLLLLLLZZZYYYYYYYYYYYYHHGGGGGGGGGGGGUUUUUUUUZZUZUUUUUUDDDDDDDAAAAAAAAAOOOOOODDDDDDDDDDDDWWWWWWWWWVHWHHHHLHFFFFFFFLWWWWYYYYFFFFFFFFFFFFF
        LZZZNZZLLLLLZZZYYYYYYYYYYHHHHGGGGGGGGGGGGGUUNUUUZZZZZUUUUZZDDDDDDDAAAAAAAAAOOOOOOOODDDDDDDDDDWWWWWWWWHHHHHHHHHHHFFHHHHWWWWWWWWWWWWFTTTTFFFFF
        ZZZZZZZZLLLLZYYYYYYYYYYYHHHHHGGGGGGGGGGGGGUNNNUUUZZZZZZZZZZDDDDDDDDDDDDDOOOOOOOOOOODDDDDDDDDDWWWWWWWHHHHHHHHHHHHHHHHHHHHWWWWWWWWWWWWTTTFFFFF
        ZZZZZFZZZZZZZZYYYYYYYYYYSSHHHGGGGGGGGGGGGGNNNNUUUUZZZZZZZDDDDDDDDDDDDDDDDOOOOOOOOOODDDDDDDDDDWWWWWWWWHHHHHHHHHHHHHHHHHHWWWWWWWWWWWWWTTTTFFFF
        DFFFFFFZZZZZZZYYYYYYYYYSSHHHHGGGGGGGGGGGGGNNNNUUUZZZZZZZZZZDDDDDDDDDDDNDLLOOOOOOOOODDDDDDDDDDDWWWWWWWWWHHHHHHHHHHHHHHHTIWWWWWWWWWWWWWTPFFFFF
        DDDFFFFZZZZMMZZMMYYYYYYYSSSHHGGGGGGGGGGGGGNNNNNNUZZZZZVVVVVVVVVDDDDDDDDDLLLLOOOOPOODDDDDDDDDDDDWWWWWWWWHHHHHHHHHHHHHHHTTTTTWWWWWWWWGFFFFFFFF
        DDDFFZFZMMMMMMMMMMMYYYYYSSSSSGGGGGGGGGGGGGNNNNNNUZZZZZVVVVVVVVVVVVDDDDDLLLLLLLLLLDDDDDDDDDDDDKDWWWWWWWHHHHHHHHHHHHHHHHTTTTTTWWWWWWWWFFFFFFFF
        DDDFFZZZMMMMMMMMMMMYYYYTLLLLLGGGGGGGGGGGGGNNNNNNNVVVVVVVVVVVVVVVVVDDDDDLLLLLLLLLLLLDDDDDDDDDKKDWWWWWWWHHHHHHHHHHHHHHHHTTTTTTWTWWWWWWFFTFFFFF
        DDDDFZZZMMMMMMMMMMMMYTTLLLLLLLLLGGGGGGGGGGNNNNNNNVVVVVVVVVVVVVVVVVDLDLLLLLLLLLLGGGGDDDKKKKKKKKDDWWWWWZZHHHHHBHHHHHHHTHTTTTTTTTTWWWWWWFTFFFFF
        DDDDZZZMMMMMMMMMMMTTTTTLLLLLLLLLGGGGGGGGGGGGGGNNNVVVVVVVVVVVVVVVVVDLLLLLLLLLLGGGGGGGDGMMKKKKKKKKKWWWZZWZHHHZBHHHHHHJTTTTTTTTTBTWSSSSWTTFFFFF
        DDDZZMMMMMMMMMMTTTTTTTLLLLLLLLLLGGGGGGGGGGGGGGNNNVVVVVVVVVVVVVVVVVLLLLLLLLLLGGGGGGGGGGGGLLKKKKKKKWWWZZZZZZZZZHBBHJJJTTTTTTTTTTTSSSSSSTTFFFFF
        DDDDDDMMMMMMMMYYYTTTTTLLLLLLLLLLLLGGGGGGGGGGGGNNNVVVVVVVVVVVVVVVVVLLLLWLLLLLLGGGGGGGGGGGLLKKKKKKKKYZZZZZZZZZZZBJJJJJTTTTTTTTTTTTRSSTSTFFFFFX
        DDDDDDDYMHMMYMYYTTTTTTLLLLLLLLLLLLGGGGGGGGGGGGNNNVVVVVVLLLZZLLLLLLLLLLWWWLLLLLGGGGGGGGGLLKKKKKKKKKYYZZZZZZZZZZBJJJJTTTTTTTTTTTTTTSSSSSSFFFFD
        DDDYYYYYMMMYYYYYYTTTTTTLLCCCLLLLLLGGGGGGGGGGGGNNNVVVVVVLLLLLLLLLLLWLLLWWOLLLLLGGGGGGGGGLLKKKKKKKKKYYYMZZZZZZZVJJJJJTTTTTTTTTTTTTTSSSSSSSSSBD
        DDYYYYYYMYYYYYMMYTTMTTTTTCCICCLLLLGGGGGGGGGGGGNNNVVVVVVLLLLLLLLLLLWLWLWWOLWLLLGGGGGGGGLLLLMRKKKKKYYYYYZZZZZZZZJJJJJTTJTTTTTTTTTTTOSSSSNNSDDD
        DDDYYYYYYYYYYYMMMMTMTTTTCCCCCCCCVVVVVVVVGGGGGGNNNVVVVVVLLLLLLLLLWWWWWWWWOLWWGGGGGGGGGGGGGMMRXKKYYYYYYYYYZZZZZZJJJJJJJTTTTTTTTTTOOOSSSSNDDDDD
        DDDYYYYYYYYYYYMMMMMMMTTTCCCCCCCCVVVVVVVYYOOOONNNNNNNNNNLLLLLLLLLWWWWWWWWWWWWGGGGGGGGGGGGMMMRXXXXXXYYYYYZZZZJJJJJJJJJJJTTTTTTOTOOOOOOSSDDDDDD
        DDYYYYYYYYYYYYMMMMTTTTTCCCCCCCCCCCCVVVVYYOOONNNNNNNNNNNLLLLLLLLLIWWWWWWWWWWWGGGGGGGGGGGMMMMRXXXXXYYYYYYYYZZZBJJBJJJJJJJTTTTTOOOOOOOOOODDDDDD
        DDDYYYYYYYYYYYMMMMMTTTTTTCCCCCCCCCCVVVVVYOONNNUNNNNNNLLLLLLLLLLLIWWWWWWWWWWWNGGGGGGGGGGGMCCXXXXXYYXYYYYYYYZBBJJBBJJJJJJJJQQTOOOOOOOODODDDDDD
        DDDDDFYYYYYYYYYYYYMTTTTTTTTCCCCCCCVVVVVVYYYRRNUUUUNNNNBLLBLLLLLLLWWWWWWWWWVVVGGGGGGGGGGGCCCGXXXXXXXXYYYYYYZBBJJBJJJJJJJZLLQTTOOXOOOODDDDDDDD
        XDXXDFYYYYYYYYYYIYYTTTTTTTTCCCCCCMVVVVVVYYYRRNRUNNNNNNBBLBLLLLNNNNWWWWWWWWVVVVGGGGGGGGCCCCCGGGCXXXXXXYYYYYBBBBBBJJJJJLLLLLQQQXXXXOOOODDDDDDD
        XXXXFFFYYYYYYYYYYTTTTTTTTTCCCCCCCMCVVVVVVVRRRRNUNNNNNNBBBBLLLLNNNNWWWWWWVVVVVVGGGGGGGGGGCCCGCGCXXXXXXYYYYYBXBBBBBJJWLLLLLLLLXXXXOOOODDDDDDDD
        XXQFFFFFYYYYYYYYFTTTTTTTTTCCCCCCCCCCVVVVVVRRRRNNNNNNNNRRRRLLLLUUUWWWUUUWWVVVVVVGGCCCGGCCCCCCCCCXXXXXVYYYYYYXXBBBBBLLLLLLLLLLXXXKKKKODDDDDDDD
        XXXXXFFFYYBYYYYYYTTTTTTTTCCCCCCCCCCCLLVVMRRRRKQNNQNNQNRRRRLLDUUUTUUUUUUUVVVVVVVGCCCCCCCCCCCCCCCXXCCCVYYYYYYXXBBBLLLLLLLLLLLLLXXKKKOOODDDDDDD
        XXXXXFFFFYBYBBBNYTTTTTTTTCCWWWCCCCCCLLLORRRBBQQQQQQQQQQQRRLLDDUUUUUUUUUUUUVVVCCCCCCCCCCCCCCCCCCCCCCVVYLYYYXXXXBBBBLLLLLLLLLLUXXKKKOOODDDDDDD
        XXXFXFFFFBBBBBBNTTGGGTTTTCWWWWCJJJCLLLLLRRLBLLQQQQQQQQQQRRRLDDUUUUUUUUUUUUVUVVVCCCCCCCCCCCCCCCCCCCCCCCLYLYXXXXXBLLLLLLLLQHHHHXXKKKKKDDDDDDDD
        XXXFFFFFFFBBBBBBYTGGGTTTTTZZWWWJJJCTLLLQQLLLLLLQQQQQQQRRRRRRDDUUUUUUUUUUUUUUVVVVVCCCWLWWCCCCCCCCCCCCCCLYLXXXXXBBLLLLLLLLLHHHHXHEKKKKKDYYKDDD
        XXFFFFFFFFBBBBBBBTGGGTTTZTZZZZWWJJLLLLLLLLLLLLLQQQQQQQQRRRRRUUUUUUUUUUUUUUVVVVVVCCCNWWWWWWCCCCCCCCCCCCLLLXXXXXXBBBLLLLLLLHHHHHHKKKKKKNKKKDDD
        XXFFFFFFFFBIBBBBBIITTTTTZZZZZZPWLLLLLLLLLLLLLLLQQQQQQRRRRRRRRUUUUUUUUUUUUUUVVVVVCVWNNWWWWCCCCWCCECCCRMRRLXXXXXXBBLLLLLLLLHHHHHOOKKKKKKKOODDD
        XFFFFFFFFFBBBBBBBIIIITFTTEZZZZPLGLLLLLLLLLLLLLLLLQQBBRRRRRRRRRRUUOUUUUUUUHVVVVVVVVWWWWWWWCWWCWCCCCRRRRRLLXXXXXXBBLLLLLLLHHHHHHHKKKKKKKOOODYY
        FFFFFFFFFFBBBBBBBBIIILZZZZZZZZLLLLLLLLLLLLLZZZLBBBBRRRRGGGGRBBBUPOUUUUUUHHVVVVVVVVWWWWWWWWWWWWWCCRRRRRRRRXXXXXXBBBLLLLLLHHHHHHHLKKKVKVTTTTYT
        FFFFFFFFFFBBBBBBBIIIIZZRZZZZZZZLLLLLLLLLLLLZZZBBBBBRRRRGGGGGGGGPPOUUUUUUUVVVVVVVVVWWWWWWWWWWWRRRRRRRRRRRRXXXXXXBBBBLLLBLHHHHHHHHHVVVKVTTTTTT
        FFFFFFFFFFBBBBBBBBIIZZZZZZZZZZZLLLLLLLLLLLLLLLBBBBRRRRRGGGGGGGGPPPUUUDDUUVVVBVWBVVVWWWWWWWWWWWRRWRRRRRERQQXXXXXBBBBLLLLLHJHHHHHHHVVVVVVVTTTT
        FFFFFFFFFFBBBBBBIIIIIJZZZZZZZZZLLLLLLLLLLLLLBBBBBBRRRRRGGGGGGGPPPPUUDDDUBVBBBVWBVVVWWWWWWWWWWWWWWRRRRREEJJXXXJBBBBBBLLJJJJHHHHHVVVVVVVEVTTTT
        FFFFFFFFFSBBBBBBIIIIIZZZZZZZZZZLLLQLLLLLULBBBBBBBRRRRRRGHGGHHGPPPPPPPPPBBBBBBBBBFWWWWWWWWWWWWWWWWRRRRRRJJJJXXJJBBBBBJJJJJJHJHVVVVVVVVVETTTTT
        FFFFFFFFFSFIIIBBIIIIZZZZZZZMZZZZLLLHLLLLLBBBBBBBBRRRRRRRHHHHHHHHHPPPPPBBBBBBBBBBBPWWWWWWWWWWWWWWWRRRRZZZJJXXXJJJBBBBJJJJJJHJJJVVVVVVVVEETTTT
        FFFFFFFFFFFIIIBIIIIIIIIIZZMMZZZLLLLLLLEELBBBBBBBBRRRRRRRRHHHHHHHHPPPPBBBBBBBBBBBBWWWWWWWWWWWWWWWWRRYRRRJJJJJJJBBBBBBJJJJJJJJJJVVVZZZZEEEEETI
        FFFFFFFFFFFFFIIIIIIIIIIPZHHMMZLLLLLLLLLLLBBBBBBBBBBRRRRRHHHHHHHHPPPPPPBBBBBBBBBBBWWWWWWWWWWWWWWWWRRRJRJJJJJJJJBBBBBJJJJJJJJJJJVVVZZZZEEEEEII
        FFFFFFFFFFFIIIIIIIIIIIIPPFHFMZLLLLLLLLLLLLBBBBBBBHHHUURHHHHHHHHPPPPPPPBBBBBBBBBBBWWBGGWWWWWWWWWWJJRJJJJJJJJJJBBBBBBJJJJJJJJJJJVVVVZZZZEEEYYY
        EFTTFFFFFFIIIIIIIIIIIIIIIFFFMLLLLLLLLLLLLLBBBBBBBBBHHHHHHHHHHHHHHPPBBBBBBBBBBBBBBBBBGSSRSWWWWWWWJJJJJJJJJJRJJBBBBBBBJJJJJJJJJJJVVVZZZGEYYYYY
        EEFFFFFFFFFFFIIIIIIIIIFFFFFHFLLLLLLLLLLLLLBBBBBBBBBHHHHHHHHHHHHHHHHBBBBBBBBBBBBBBBBBSSSSSSWWWWWWJJJJJJJJJJJJBBBBBBBBBIIRJJJJJJJWVVVVYYXXYYYY
        EEFFFFFFFFFFFIIIIIIIIFFFFFFFFFLLLLLLLLLLLLBBBDBBBBBBHHHHHHHHHHHHHHHBBBBBBBBBBBSBBBBBBBSSSSSWWWWWWJJJJJJJJJBBBBBBBIBBIIIIIIJWWWWWWWWVYYYYYYYY
        EEFFFFFFFFFFIIFIIIIIWFFFFFFFFLLLLLLLLLLLLLLDDDBDBBDBHHHHHHHHHHHHHHHBBBBBBBBBBBSBBBBBBBSSSSSSSWWWWJJJJJJJJJJJBBBIIIBBIIIIIIIOWWWWWWYYYYYYYYYY
        EFFFFFFFFFFFFFFIIIIIWTFFFFFFFLLLLLLLLLLLLYYYYDDDDDDBHHHHHHHHHHHHHHHHHBBBBBBBBBBBBBBBBBSSWSSSSWWWWWWJJJZJXXXJBBBIIIIIIIIIIIZWWWWWWYYYYYYYYYYY
        EEZFFFFFFFFFFFFIIIIWWTFFFFFFFLLLLLLLYYYYYYYYYDDDDGHHHHHAHHHHHHHHHHHHLBBBBBYBBBYBBBBBBBWWWSSSSWWWWEEJEJJXXXQRBBBIIIIIIIIIIIIIWWWWWWYYYYYYYYYY
        ZZZBFFFFFFFFFFFIIIIIWFFFFFFFFLLLLLLLLYYYYYYYDDDDDDPPHHAAAAHHHHHHHHHHLBYBYYYYYYYYBBBBBWWWWSSWSWWWWEEEEQQQQQQRBBFNNRIIIIIIIIIICWWWWYYYYYYYYYYY
        ZZZBFFFFFFFFFIIIIGIIWWFFFFFCFULLLLLMLYYYYYYYYDDDDDEPPPAAAAAHHHHHHHHHHHYYYYYYYYYBBBBBBWWWWWSWSWWEEEEEEQQQQQQRRBBNNRRIIIIIIIICCWWWWWYYYYYYYYYY
        ZZZZZZFFFFFFFIIIIIIWWFFFFFFFWWLLLLLLYYYYYYYYYYEDEEEPAAAAAAKKKHHHHHHHHHHHYYYYYYBBBBBBBZWWWWWWWWWEEEEEEQQQQQQQRBBNNNIIIIIIICCCCCTTWTYYYYYYYYYY
        ZZZZZZZFFFUFFIIIIIIWWWWFFFFFWWWLLLYLYRYYYYYYYYEEEEEAAAAAAAKHHHHHHHHHHHHHYYYYYYYBBBBBBZWWWWWWWWEEEEEEEQQQQQQRRQQQNNIIIIIIICCCCTTTTTTYYYYYYYYY
        ZZZZZFFFFFFFFFFIIIIIWWWWFFWWWWWLWWYYYRYRYYYYYYEEEEEAAAAAAAAHHLLWHHHHHHHHHYYYYYYYBBBBBZWWWWWWWWWWEEVEEQQQQQQQQQQQNNNIICCCCCCCCTTTTTTTYYYYYYYY
        ZZZZZVVVVFFFFVVIIIIWWWWWFWWWWWWWWWWRRRRRRYYYYYEEEEEEAAAAAALLLLLWHHHHHHHYYYYYYYYYYZZZZZZZZWWWWWWWWEVVQNQQQQQQQQQNNNNNICCCCCCCCCCTTTTTTTYYYYYY
        ZZZZZZVVVVVFFVVIWWWWWWWWWWWWWWWWRRRRRRRRRRIYIIIEEEEEAEEEALLLLLLHHHHHHHYYYYYYYYZZZZEZZZZZZWWWVWWWVWVQQQQQQQQQQQQQNNNNCCCCCCCCCTTTTTTTTTYYYYYY
        VVVZZVVVVVVVVVVVVWWVWWWWWWWWWWWWRRRRRRRRRRIYIIIEEEEEEEEEEELLLLLHHHHDHYYYYYZZZZZZZZZZZZZZWWWVVVVWVVVVVQBQQQQQQQNNNNNNNNCCCCCCCTTTTTTTTTYYYYYY
        VVVZVVVVVVVVVVVVVVVVWWWWWWWWWWWWRRRRRRRRRRIIIEEEEEEEEEEEELLLLLLLLLLLYYYYRYZZZZZZZZZZZZZZWWWWVVVVVVVVQQQQQQQQQNNNNNNNNCCCCCCCCTTTTTTTTYYYYYYY
        VVVVVVVVVVVVVVVVVVVVWWWWWWWWWWWWBRRRRRRRIIIIIEEEEEEEEEEEEELLLLLLLLLYYYYRRRKKZZZZZZZZZZZZZZVVVVVVVVVVVQQQQQQQNNNNNNNNNCCCCCCCCTTTTTTTTTTYYYYY
        VVVVVVVVVVVVVVVVVVVVVWWWWWWWWWWWRRRRRRRRIIIIIEEEEEEEEEEEELLLLLLLLLLLYYYRRRRKZZZZZZZZZZZZZZVVVVVVVVVVVVQQNQQNNNNNNNNNNCCCCCCCCTTTTTTTTTYYYYYY
        VVVVVVVVVVVVVVVVVVVVWWWWWWWWWWWWWRRRRRRRRIEEEEEEEEEEEEEELLLLLLLLLLLLLYRRRRRZZZZZZZZZZZZZZZWVVVVVVVVVVVNNNNNNNNNNNNNNNNNCCCCTTTTTTTTTTTYYYYYT
        VVVVVVVVVVVVVVVVVWWWWWWWWWWWWWWWWRRRRRRRRREEEEEEEEEEEEEEELLLLLLLLLLEERRRRRZZZZZZZZZZZZZZZZZVVVVVVVVVVVNNNNNNNNNNNNNNNCCCCDCTTTTTTTTTTTYYYYTT
""".trimIndent()
}