package day13

object Day13Input {

    val testInput = """
        Button A: X+94, Y+34
        Button B: X+22, Y+67
        Prize: X=8400, Y=5400

        Button A: X+26, Y+66
        Button B: X+67, Y+21
        Prize: X=12748, Y=12176

        Button A: X+17, Y+86
        Button B: X+84, Y+37
        Prize: X=7870, Y=6450

        Button A: X+69, Y+23
        Button B: X+27, Y+71
        Prize: X=18641, Y=10279
    """.trimIndent()

    val prodInput = """
        Button A: X+29, Y+71
        Button B: X+52, Y+31
        Prize: X=5388, Y=4716

        Button A: X+47, Y+16
        Button B: X+14, Y+21
        Prize: X=4795, Y=2996

        Button A: X+21, Y+11
        Button B: X+12, Y+60
        Prize: X=741, Y=2859

        Button A: X+61, Y+34
        Button B: X+17, Y+50
        Prize: X=2223, Y=12510

        Button A: X+49, Y+84
        Button B: X+71, Y+22
        Prize: X=6954, Y=8830

        Button A: X+63, Y+94
        Button B: X+79, Y+28
        Prize: X=3313, Y=2966

        Button A: X+63, Y+34
        Button B: X+16, Y+47
        Prize: X=2601, Y=19683

        Button A: X+58, Y+16
        Button B: X+34, Y+69
        Prize: X=1538, Y=782

        Button A: X+32, Y+13
        Button B: X+33, Y+65
        Prize: X=14263, Y=17657

        Button A: X+61, Y+12
        Button B: X+28, Y+67
        Prize: X=11219, Y=19511

        Button A: X+31, Y+67
        Button B: X+63, Y+23
        Prize: X=12991, Y=911

        Button A: X+13, Y+29
        Button B: X+55, Y+38
        Prize: X=2352, Y=12511

        Button A: X+55, Y+31
        Button B: X+26, Y+45
        Prize: X=8031, Y=11372

        Button A: X+27, Y+17
        Button B: X+21, Y+46
        Prize: X=13241, Y=17761

        Button A: X+17, Y+36
        Button B: X+57, Y+29
        Prize: X=9818, Y=2628

        Button A: X+26, Y+43
        Button B: X+53, Y+23
        Prize: X=9328, Y=13971

        Button A: X+22, Y+80
        Button B: X+80, Y+64
        Prize: X=5684, Y=5920

        Button A: X+45, Y+98
        Button B: X+94, Y+37
        Prize: X=9896, Y=6625

        Button A: X+13, Y+67
        Button B: X+67, Y+15
        Prize: X=4487, Y=19239

        Button A: X+49, Y+13
        Button B: X+22, Y+44
        Prize: X=8574, Y=8268

        Button A: X+46, Y+16
        Button B: X+17, Y+69
        Prize: X=15584, Y=17398

        Button A: X+71, Y+85
        Button B: X+90, Y+31
        Prize: X=12308, Y=7751

        Button A: X+55, Y+26
        Button B: X+33, Y+59
        Prize: X=3036, Y=5211

        Button A: X+33, Y+71
        Button B: X+85, Y+43
        Prize: X=5600, Y=3376

        Button A: X+47, Y+65
        Button B: X+83, Y+24
        Prize: X=4787, Y=4623

        Button A: X+64, Y+69
        Button B: X+87, Y+13
        Prize: X=6933, Y=3354

        Button A: X+86, Y+11
        Button B: X+19, Y+62
        Prize: X=3043, Y=3189

        Button A: X+88, Y+21
        Button B: X+19, Y+36
        Prize: X=3247, Y=2946

        Button A: X+12, Y+31
        Button B: X+62, Y+21
        Prize: X=10044, Y=15067

        Button A: X+13, Y+34
        Button B: X+65, Y+15
        Prize: X=14563, Y=2264

        Button A: X+82, Y+26
        Button B: X+37, Y+69
        Prize: X=7403, Y=3779

        Button A: X+48, Y+76
        Button B: X+44, Y+19
        Prize: X=10552, Y=14750

        Button A: X+20, Y+72
        Button B: X+42, Y+14
        Prize: X=5892, Y=2256

        Button A: X+21, Y+67
        Button B: X+60, Y+15
        Prize: X=3891, Y=5357

        Button A: X+26, Y+56
        Button B: X+64, Y+32
        Prize: X=1574, Y=18312

        Button A: X+75, Y+34
        Button B: X+14, Y+40
        Prize: X=2859, Y=4022

        Button A: X+58, Y+51
        Button B: X+31, Y+99
        Prize: X=4132, Y=6216

        Button A: X+35, Y+61
        Button B: X+62, Y+34
        Prize: X=17642, Y=17366

        Button A: X+66, Y+23
        Button B: X+15, Y+57
        Prize: X=7568, Y=2293

        Button A: X+23, Y+68
        Button B: X+47, Y+17
        Prize: X=5337, Y=7242

        Button A: X+11, Y+59
        Button B: X+73, Y+31
        Prize: X=1976, Y=19532

        Button A: X+35, Y+89
        Button B: X+43, Y+12
        Prize: X=5090, Y=4669

        Button A: X+48, Y+70
        Button B: X+57, Y+25
        Prize: X=9210, Y=8200

        Button A: X+44, Y+80
        Button B: X+95, Y+30
        Prize: X=7211, Y=7830

        Button A: X+28, Y+17
        Button B: X+30, Y+57
        Prize: X=17276, Y=14123

        Button A: X+24, Y+99
        Button B: X+74, Y+69
        Prize: X=4472, Y=8997

        Button A: X+44, Y+79
        Button B: X+83, Y+21
        Prize: X=8621, Y=6389

        Button A: X+50, Y+29
        Button B: X+18, Y+51
        Prize: X=5272, Y=6262

        Button A: X+55, Y+22
        Button B: X+27, Y+66
        Prize: X=6449, Y=9098

        Button A: X+67, Y+48
        Button B: X+29, Y+77
        Prize: X=4049, Y=6724

        Button A: X+73, Y+12
        Button B: X+22, Y+76
        Prize: X=17384, Y=3832

        Button A: X+57, Y+24
        Button B: X+13, Y+30
        Prize: X=11289, Y=2744

        Button A: X+58, Y+83
        Button B: X+97, Y+44
        Prize: X=7205, Y=6613

        Button A: X+58, Y+23
        Button B: X+14, Y+95
        Prize: X=4604, Y=8266

        Button A: X+47, Y+78
        Button B: X+29, Y+12
        Prize: X=18393, Y=15038

        Button A: X+32, Y+24
        Button B: X+12, Y+63
        Prize: X=3716, Y=6405

        Button A: X+60, Y+82
        Button B: X+89, Y+39
        Prize: X=10051, Y=8861

        Button A: X+34, Y+69
        Button B: X+77, Y+42
        Prize: X=9646, Y=10206

        Button A: X+34, Y+48
        Button B: X+91, Y+28
        Prize: X=7490, Y=4144

        Button A: X+21, Y+93
        Button B: X+38, Y+25
        Prize: X=1912, Y=1733

        Button A: X+16, Y+71
        Button B: X+64, Y+41
        Prize: X=5872, Y=5888

        Button A: X+95, Y+83
        Button B: X+22, Y+82
        Prize: X=8676, Y=9024

        Button A: X+76, Y+34
        Button B: X+14, Y+57
        Prize: X=7858, Y=6103

        Button A: X+18, Y+48
        Button B: X+49, Y+26
        Prize: X=7233, Y=6394

        Button A: X+60, Y+22
        Button B: X+12, Y+37
        Prize: X=3816, Y=4594

        Button A: X+37, Y+81
        Button B: X+65, Y+19
        Prize: X=3109, Y=1751

        Button A: X+57, Y+63
        Button B: X+11, Y+90
        Prize: X=4465, Y=12330

        Button A: X+55, Y+22
        Button B: X+32, Y+58
        Prize: X=18992, Y=3264

        Button A: X+27, Y+90
        Button B: X+85, Y+36
        Prize: X=5030, Y=9594

        Button A: X+89, Y+39
        Button B: X+16, Y+94
        Prize: X=2210, Y=4274

        Button A: X+70, Y+42
        Button B: X+18, Y+45
        Prize: X=7150, Y=7368

        Button A: X+55, Y+35
        Button B: X+14, Y+45
        Prize: X=13106, Y=9340

        Button A: X+23, Y+56
        Button B: X+69, Y+34
        Prize: X=8219, Y=8774

        Button A: X+66, Y+20
        Button B: X+24, Y+92
        Prize: X=2736, Y=3032

        Button A: X+75, Y+24
        Button B: X+23, Y+27
        Prize: X=6819, Y=3714

        Button A: X+54, Y+76
        Button B: X+79, Y+14
        Prize: X=6844, Y=6328

        Button A: X+36, Y+63
        Button B: X+49, Y+27
        Prize: X=7784, Y=13157

        Button A: X+67, Y+18
        Button B: X+15, Y+66
        Prize: X=1604, Y=15416

        Button A: X+58, Y+28
        Button B: X+12, Y+41
        Prize: X=3908, Y=2802

        Button A: X+16, Y+85
        Button B: X+32, Y+14
        Prize: X=2400, Y=3546

        Button A: X+40, Y+23
        Button B: X+35, Y+61
        Prize: X=9350, Y=1199

        Button A: X+18, Y+36
        Button B: X+40, Y+11
        Prize: X=11872, Y=621

        Button A: X+79, Y+55
        Button B: X+32, Y+88
        Prize: X=7757, Y=10461

        Button A: X+87, Y+23
        Button B: X+12, Y+79
        Prize: X=2631, Y=3577

        Button A: X+11, Y+49
        Button B: X+68, Y+30
        Prize: X=15642, Y=2000

        Button A: X+47, Y+19
        Button B: X+37, Y+64
        Prize: X=12590, Y=18040

        Button A: X+91, Y+21
        Button B: X+22, Y+53
        Prize: X=2355, Y=2700

        Button A: X+11, Y+81
        Button B: X+25, Y+29
        Prize: X=867, Y=2507

        Button A: X+45, Y+34
        Button B: X+13, Y+34
        Prize: X=3230, Y=8812

        Button A: X+13, Y+29
        Button B: X+86, Y+19
        Prize: X=7194, Y=2739

        Button A: X+29, Y+12
        Button B: X+42, Y+58
        Prize: X=9035, Y=938

        Button A: X+18, Y+79
        Button B: X+99, Y+75
        Prize: X=8559, Y=7007

        Button A: X+39, Y+12
        Button B: X+30, Y+73
        Prize: X=18224, Y=4138

        Button A: X+47, Y+15
        Button B: X+39, Y+46
        Prize: X=5397, Y=3333

        Button A: X+11, Y+44
        Button B: X+71, Y+22
        Prize: X=626, Y=14004

        Button A: X+31, Y+70
        Button B: X+38, Y+20
        Prize: X=5135, Y=5870

        Button A: X+31, Y+64
        Button B: X+46, Y+15
        Prize: X=4718, Y=5317

        Button A: X+52, Y+15
        Button B: X+34, Y+61
        Prize: X=19776, Y=4845

        Button A: X+63, Y+21
        Button B: X+18, Y+68
        Prize: X=12698, Y=734

        Button A: X+11, Y+58
        Button B: X+64, Y+24
        Prize: X=19282, Y=4620

        Button A: X+11, Y+49
        Button B: X+84, Y+30
        Prize: X=8877, Y=7387

        Button A: X+16, Y+98
        Button B: X+29, Y+27
        Prize: X=1699, Y=8147

        Button A: X+68, Y+85
        Button B: X+84, Y+17
        Prize: X=1320, Y=1122

        Button A: X+47, Y+18
        Button B: X+12, Y+19
        Prize: X=9197, Y=14349

        Button A: X+18, Y+82
        Button B: X+57, Y+57
        Prize: X=4212, Y=8244

        Button A: X+21, Y+50
        Button B: X+48, Y+21
        Prize: X=19220, Y=13256

        Button A: X+15, Y+97
        Button B: X+79, Y+42
        Prize: X=4719, Y=6604

        Button A: X+37, Y+71
        Button B: X+92, Y+58
        Prize: X=4093, Y=4535

        Button A: X+16, Y+66
        Button B: X+80, Y+21
        Prize: X=17136, Y=1205

        Button A: X+40, Y+30
        Button B: X+16, Y+55
        Prize: X=1392, Y=2635

        Button A: X+38, Y+14
        Button B: X+21, Y+41
        Prize: X=17360, Y=12000

        Button A: X+22, Y+95
        Button B: X+72, Y+21
        Prize: X=2082, Y=7251

        Button A: X+64, Y+18
        Button B: X+61, Y+89
        Prize: X=4725, Y=3125

        Button A: X+18, Y+89
        Button B: X+96, Y+50
        Prize: X=7764, Y=9936

        Button A: X+64, Y+20
        Button B: X+16, Y+87
        Prize: X=6624, Y=7810

        Button A: X+49, Y+24
        Button B: X+11, Y+56
        Prize: X=7663, Y=19448

        Button A: X+80, Y+14
        Button B: X+59, Y+64
        Prize: X=6788, Y=6126

        Button A: X+90, Y+39
        Button B: X+56, Y+90
        Prize: X=13578, Y=11997

        Button A: X+17, Y+44
        Button B: X+44, Y+21
        Prize: X=16409, Y=13862

        Button A: X+30, Y+25
        Button B: X+27, Y+81
        Prize: X=4479, Y=8237

        Button A: X+34, Y+72
        Button B: X+32, Y+11
        Prize: X=17594, Y=6142

        Button A: X+22, Y+70
        Button B: X+69, Y+12
        Prize: X=4853, Y=1628

        Button A: X+44, Y+79
        Button B: X+43, Y+13
        Prize: X=5208, Y=13828

        Button A: X+29, Y+46
        Button B: X+44, Y+21
        Prize: X=16486, Y=17474

        Button A: X+91, Y+37
        Button B: X+34, Y+98
        Prize: X=7377, Y=6619

        Button A: X+19, Y+94
        Button B: X+66, Y+63
        Prize: X=4170, Y=10353

        Button A: X+93, Y+87
        Button B: X+89, Y+17
        Prize: X=6270, Y=1890

        Button A: X+37, Y+18
        Button B: X+15, Y+48
        Prize: X=11639, Y=11552

        Button A: X+31, Y+14
        Button B: X+38, Y+67
        Prize: X=2853, Y=13372

        Button A: X+42, Y+12
        Button B: X+32, Y+58
        Prize: X=11178, Y=16954

        Button A: X+49, Y+99
        Button B: X+53, Y+12
        Prize: X=7435, Y=9507

        Button A: X+43, Y+29
        Button B: X+11, Y+39
        Prize: X=14616, Y=1736

        Button A: X+39, Y+11
        Button B: X+59, Y+79
        Prize: X=6578, Y=7530

        Button A: X+73, Y+16
        Button B: X+11, Y+62
        Prize: X=4992, Y=7314

        Button A: X+78, Y+13
        Button B: X+30, Y+51
        Prize: X=5592, Y=4842

        Button A: X+74, Y+24
        Button B: X+14, Y+94
        Prize: X=1686, Y=8956

        Button A: X+31, Y+56
        Button B: X+44, Y+20
        Prize: X=19755, Y=17496

        Button A: X+39, Y+22
        Button B: X+24, Y+58
        Prize: X=2379, Y=1920

        Button A: X+28, Y+48
        Button B: X+41, Y+23
        Prize: X=17638, Y=290

        Button A: X+21, Y+44
        Button B: X+43, Y+14
        Prize: X=12687, Y=15890

        Button A: X+22, Y+13
        Button B: X+20, Y+99
        Prize: X=2730, Y=10157

        Button A: X+66, Y+17
        Button B: X+77, Y+85
        Prize: X=7447, Y=3417

        Button A: X+31, Y+15
        Button B: X+28, Y+46
        Prize: X=9921, Y=6127

        Button A: X+15, Y+53
        Button B: X+64, Y+19
        Prize: X=11172, Y=1343

        Button A: X+18, Y+75
        Button B: X+66, Y+18
        Prize: X=14042, Y=16058

        Button A: X+19, Y+90
        Button B: X+66, Y+11
        Prize: X=6241, Y=6337

        Button A: X+96, Y+80
        Button B: X+17, Y+83
        Prize: X=8419, Y=12729

        Button A: X+39, Y+48
        Button B: X+51, Y+17
        Prize: X=6522, Y=4869

        Button A: X+29, Y+15
        Button B: X+16, Y+46
        Prize: X=8057, Y=12355

        Button A: X+17, Y+44
        Button B: X+44, Y+24
        Prize: X=1866, Y=12616

        Button A: X+21, Y+44
        Button B: X+66, Y+30
        Prize: X=9695, Y=1532

        Button A: X+54, Y+21
        Button B: X+20, Y+49
        Prize: X=2434, Y=6402

        Button A: X+55, Y+66
        Button B: X+55, Y+18
        Prize: X=5060, Y=2568

        Button A: X+70, Y+11
        Button B: X+14, Y+57
        Prize: X=9832, Y=524

        Button A: X+18, Y+73
        Button B: X+65, Y+17
        Prize: X=13511, Y=4266

        Button A: X+14, Y+69
        Button B: X+62, Y+33
        Prize: X=3316, Y=6258

        Button A: X+71, Y+16
        Button B: X+31, Y+37
        Prize: X=6052, Y=1724

        Button A: X+41, Y+63
        Button B: X+50, Y+14
        Prize: X=6977, Y=6951

        Button A: X+44, Y+21
        Button B: X+16, Y+38
        Prize: X=15596, Y=7785

        Button A: X+44, Y+80
        Button B: X+45, Y+14
        Prize: X=18455, Y=16762

        Button A: X+64, Y+28
        Button B: X+11, Y+29
        Prize: X=5092, Y=18412

        Button A: X+49, Y+30
        Button B: X+18, Y+61
        Prize: X=2349, Y=4287

        Button A: X+78, Y+39
        Button B: X+16, Y+55
        Prize: X=18792, Y=11304

        Button A: X+70, Y+15
        Button B: X+85, Y+84
        Prize: X=4365, Y=1659

        Button A: X+83, Y+99
        Button B: X+73, Y+26
        Prize: X=9696, Y=8939

        Button A: X+19, Y+64
        Button B: X+51, Y+18
        Prize: X=12732, Y=18462

        Button A: X+12, Y+85
        Button B: X+56, Y+34
        Prize: X=600, Y=986

        Button A: X+56, Y+32
        Button B: X+11, Y+61
        Prize: X=380, Y=436

        Button A: X+46, Y+98
        Button B: X+71, Y+11
        Prize: X=2140, Y=2876

        Button A: X+60, Y+19
        Button B: X+19, Y+62
        Prize: X=18888, Y=13062

        Button A: X+45, Y+68
        Button B: X+37, Y+11
        Prize: X=12993, Y=9189

        Button A: X+38, Y+80
        Button B: X+60, Y+18
        Prize: X=9222, Y=2250

        Button A: X+34, Y+23
        Button B: X+48, Y+99
        Prize: X=1970, Y=3262

        Button A: X+25, Y+48
        Button B: X+98, Y+38
        Prize: X=5093, Y=3622

        Button A: X+15, Y+55
        Button B: X+54, Y+32
        Prize: X=3627, Y=4501

        Button A: X+14, Y+55
        Button B: X+87, Y+34
        Prize: X=6042, Y=7116

        Button A: X+97, Y+11
        Button B: X+75, Y+98
        Prize: X=10393, Y=2700

        Button A: X+48, Y+16
        Button B: X+12, Y+49
        Prize: X=5664, Y=6028

        Button A: X+55, Y+85
        Button B: X+88, Y+18
        Prize: X=3861, Y=3961

        Button A: X+69, Y+27
        Button B: X+50, Y+77
        Prize: X=7731, Y=4059

        Button A: X+41, Y+11
        Button B: X+24, Y+45
        Prize: X=18974, Y=2387

        Button A: X+18, Y+48
        Button B: X+64, Y+22
        Prize: X=19244, Y=14654

        Button A: X+24, Y+40
        Button B: X+87, Y+36
        Prize: X=3177, Y=1916

        Button A: X+11, Y+52
        Button B: X+42, Y+20
        Prize: X=10250, Y=12128

        Button A: X+26, Y+22
        Button B: X+16, Y+66
        Prize: X=3032, Y=5346

        Button A: X+81, Y+27
        Button B: X+52, Y+98
        Prize: X=10266, Y=7536

        Button A: X+37, Y+20
        Button B: X+18, Y+48
        Prize: X=16841, Y=16484

        Button A: X+62, Y+19
        Button B: X+15, Y+52
        Prize: X=3367, Y=8360

        Button A: X+49, Y+22
        Button B: X+19, Y+30
        Prize: X=4357, Y=766

        Button A: X+41, Y+17
        Button B: X+17, Y+33
        Prize: X=10150, Y=13358

        Button A: X+94, Y+38
        Button B: X+56, Y+84
        Prize: X=11506, Y=10358

        Button A: X+20, Y+41
        Button B: X+51, Y+31
        Prize: X=8049, Y=8659

        Button A: X+38, Y+76
        Button B: X+59, Y+38
        Prize: X=4712, Y=3344

        Button A: X+59, Y+23
        Button B: X+11, Y+23
        Prize: X=19102, Y=5206

        Button A: X+30, Y+78
        Button B: X+67, Y+19
        Prize: X=1112, Y=5864

        Button A: X+52, Y+18
        Button B: X+15, Y+24
        Prize: X=5023, Y=2886

        Button A: X+41, Y+18
        Button B: X+40, Y+67
        Prize: X=12191, Y=18022

        Button A: X+34, Y+12
        Button B: X+53, Y+78
        Prize: X=19655, Y=10970

        Button A: X+62, Y+97
        Button B: X+62, Y+23
        Prize: X=5642, Y=2833

        Button A: X+54, Y+28
        Button B: X+27, Y+46
        Prize: X=17432, Y=5168

        Button A: X+12, Y+31
        Button B: X+84, Y+60
        Prize: X=16064, Y=15470

        Button A: X+52, Y+14
        Button B: X+23, Y+69
        Prize: X=7657, Y=12397

        Button A: X+35, Y+13
        Button B: X+13, Y+42
        Prize: X=2589, Y=3861

        Button A: X+15, Y+33
        Button B: X+22, Y+13
        Prize: X=11329, Y=14497

        Button A: X+63, Y+71
        Button B: X+71, Y+20
        Prize: X=10736, Y=7178

        Button A: X+15, Y+37
        Button B: X+94, Y+35
        Prize: X=2897, Y=2618

        Button A: X+22, Y+79
        Button B: X+57, Y+44
        Prize: X=4278, Y=5721

        Button A: X+62, Y+76
        Button B: X+80, Y+13
        Prize: X=13004, Y=7519

        Button A: X+25, Y+13
        Button B: X+18, Y+46
        Prize: X=10630, Y=18270

        Button A: X+51, Y+16
        Button B: X+37, Y+73
        Prize: X=3377, Y=6155

        Button A: X+15, Y+35
        Button B: X+66, Y+35
        Prize: X=10817, Y=12170

        Button A: X+32, Y+55
        Button B: X+51, Y+17
        Prize: X=10777, Y=9727

        Button A: X+13, Y+60
        Button B: X+73, Y+33
        Prize: X=367, Y=11945

        Button A: X+17, Y+68
        Button B: X+70, Y+19
        Prize: X=7935, Y=18594

        Button A: X+28, Y+54
        Button B: X+66, Y+40
        Prize: X=16520, Y=9812

        Button A: X+23, Y+72
        Button B: X+74, Y+25
        Prize: X=14040, Y=4926

        Button A: X+78, Y+73
        Button B: X+83, Y+12
        Prize: X=9936, Y=3782

        Button A: X+27, Y+41
        Button B: X+82, Y+35
        Prize: X=4765, Y=3655

        Button A: X+51, Y+25
        Button B: X+17, Y+49
        Prize: X=1230, Y=18502

        Button A: X+58, Y+40
        Button B: X+40, Y+95
        Prize: X=9102, Y=11940

        Button A: X+75, Y+34
        Button B: X+20, Y+57
        Prize: X=2100, Y=14380

        Button A: X+89, Y+30
        Button B: X+56, Y+73
        Prize: X=8039, Y=3684

        Button A: X+64, Y+13
        Button B: X+13, Y+80
        Prize: X=15579, Y=5585

        Button A: X+70, Y+13
        Button B: X+68, Y+99
        Prize: X=4644, Y=2849

        Button A: X+53, Y+19
        Button B: X+32, Y+70
        Prize: X=1587, Y=1951

        Button A: X+71, Y+19
        Button B: X+13, Y+55
        Prize: X=18219, Y=10159

        Button A: X+88, Y+24
        Button B: X+63, Y+94
        Prize: X=12746, Y=9468

        Button A: X+18, Y+54
        Button B: X+49, Y+18
        Prize: X=13757, Y=18944

        Button A: X+62, Y+19
        Button B: X+11, Y+51
        Prize: X=11171, Y=10870

        Button A: X+85, Y+98
        Button B: X+79, Y+18
        Prize: X=1932, Y=912

        Button A: X+36, Y+13
        Button B: X+14, Y+49
        Prize: X=2160, Y=3944

        Button A: X+19, Y+61
        Button B: X+87, Y+47
        Prize: X=9370, Y=7548

        Button A: X+96, Y+11
        Button B: X+42, Y+71
        Prize: X=3900, Y=6139

        Button A: X+85, Y+91
        Button B: X+68, Y+20
        Prize: X=10098, Y=6534

        Button A: X+16, Y+19
        Button B: X+92, Y+12
        Prize: X=2304, Y=791

        Button A: X+12, Y+96
        Button B: X+78, Y+20
        Prize: X=1686, Y=3220

        Button A: X+22, Y+42
        Button B: X+39, Y+11
        Prize: X=1749, Y=5985

        Button A: X+42, Y+16
        Button B: X+23, Y+48
        Prize: X=8578, Y=4160

        Button A: X+20, Y+49
        Button B: X+78, Y+26
        Prize: X=2818, Y=1786

        Button A: X+21, Y+53
        Button B: X+50, Y+18
        Prize: X=11452, Y=12732

        Button A: X+37, Y+18
        Button B: X+25, Y+39
        Prize: X=13915, Y=6356

        Button A: X+21, Y+98
        Button B: X+21, Y+18
        Prize: X=1743, Y=7414

        Button A: X+84, Y+79
        Button B: X+15, Y+86
        Prize: X=2124, Y=3723

        Button A: X+41, Y+54
        Button B: X+55, Y+18
        Prize: X=8532, Y=6120

        Button A: X+38, Y+64
        Button B: X+30, Y+15
        Prize: X=1248, Y=1569

        Button A: X+68, Y+33
        Button B: X+26, Y+57
        Prize: X=15350, Y=19079

        Button A: X+12, Y+61
        Button B: X+90, Y+78
        Prize: X=7584, Y=9710

        Button A: X+69, Y+14
        Button B: X+14, Y+90
        Prize: X=3911, Y=3234

        Button A: X+59, Y+35
        Button B: X+13, Y+34
        Prize: X=9247, Y=16339

        Button A: X+40, Y+11
        Button B: X+11, Y+66
        Prize: X=11174, Y=1255

        Button A: X+87, Y+99
        Button B: X+54, Y+11
        Prize: X=5433, Y=4114

        Button A: X+17, Y+78
        Button B: X+57, Y+49
        Prize: X=1895, Y=3594

        Button A: X+81, Y+65
        Button B: X+22, Y+63
        Prize: X=3521, Y=5909

        Button A: X+58, Y+99
        Button B: X+66, Y+35
        Prize: X=5042, Y=3015

        Button A: X+19, Y+50
        Button B: X+49, Y+22
        Prize: X=12558, Y=2900

        Button A: X+57, Y+29
        Button B: X+17, Y+44
        Prize: X=13239, Y=1533

        Button A: X+31, Y+69
        Button B: X+49, Y+16
        Prize: X=3513, Y=17917

        Button A: X+70, Y+38
        Button B: X+17, Y+51
        Prize: X=3714, Y=9326

        Button A: X+47, Y+14
        Button B: X+36, Y+75
        Prize: X=1969, Y=6868

        Button A: X+12, Y+49
        Button B: X+66, Y+35
        Prize: X=18962, Y=15964

        Button A: X+46, Y+61
        Button B: X+74, Y+21
        Prize: X=10072, Y=6646

        Button A: X+68, Y+19
        Button B: X+75, Y+90
        Prize: X=4839, Y=2802

        Button A: X+39, Y+13
        Button B: X+28, Y+38
        Prize: X=3130, Y=1932

        Button A: X+60, Y+20
        Button B: X+22, Y+56
        Prize: X=11652, Y=10996

        Button A: X+21, Y+47
        Button B: X+76, Y+50
        Prize: X=16051, Y=14205

        Button A: X+24, Y+92
        Button B: X+85, Y+69
        Prize: X=7673, Y=9637

        Button A: X+72, Y+16
        Button B: X+69, Y+73
        Prize: X=2067, Y=863

        Button A: X+85, Y+31
        Button B: X+47, Y+59
        Prize: X=4672, Y=4048

        Button A: X+79, Y+62
        Button B: X+35, Y+89
        Prize: X=7740, Y=7182

        Button A: X+20, Y+84
        Button B: X+66, Y+43
        Prize: X=6530, Y=5177

        Button A: X+60, Y+18
        Button B: X+62, Y+99
        Prize: X=3418, Y=3357

        Button A: X+67, Y+11
        Button B: X+18, Y+61
        Prize: X=15779, Y=4864

        Button A: X+72, Y+29
        Button B: X+38, Y+65
        Prize: X=6958, Y=4840

        Button A: X+41, Y+64
        Button B: X+72, Y+17
        Prize: X=1910, Y=1646

        Button A: X+17, Y+59
        Button B: X+32, Y+15
        Prize: X=13963, Y=3310

        Button A: X+13, Y+34
        Button B: X+54, Y+39
        Prize: X=17275, Y=10735

        Button A: X+68, Y+22
        Button B: X+11, Y+43
        Prize: X=4043, Y=14171

        Button A: X+49, Y+41
        Button B: X+69, Y+11
        Prize: X=5997, Y=3943

        Button A: X+13, Y+67
        Button B: X+54, Y+15
        Prize: X=18389, Y=14300

        Button A: X+35, Y+12
        Button B: X+25, Y+39
        Prize: X=8260, Y=16295

        Button A: X+11, Y+82
        Button B: X+80, Y+12
        Prize: X=8144, Y=6364

        Button A: X+80, Y+23
        Button B: X+50, Y+60
        Prize: X=5060, Y=1911

        Button A: X+39, Y+22
        Button B: X+15, Y+89
        Prize: X=807, Y=1019

        Button A: X+19, Y+47
        Button B: X+17, Y+11
        Prize: X=19529, Y=7457

        Button A: X+88, Y+33
        Button B: X+13, Y+21
        Prize: X=1447, Y=591

        Button A: X+28, Y+80
        Button B: X+70, Y+16
        Prize: X=3980, Y=11856

        Button A: X+51, Y+27
        Button B: X+31, Y+54
        Prize: X=8544, Y=12140

        Button A: X+28, Y+64
        Button B: X+59, Y+21
        Prize: X=18595, Y=9393

        Button A: X+26, Y+80
        Button B: X+60, Y+34
        Prize: X=6396, Y=5974

        Button A: X+43, Y+25
        Button B: X+24, Y+85
        Prize: X=3675, Y=2705

        Button A: X+49, Y+15
        Button B: X+39, Y+70
        Prize: X=1505, Y=13780

        Button A: X+65, Y+11
        Button B: X+40, Y+51
        Prize: X=3450, Y=805

        Button A: X+26, Y+71
        Button B: X+77, Y+52
        Prize: X=6108, Y=8133

        Button A: X+71, Y+31
        Button B: X+15, Y+61
        Prize: X=1068, Y=3570

        Button A: X+16, Y+77
        Button B: X+94, Y+54
        Prize: X=9970, Y=10135

        Button A: X+44, Y+15
        Button B: X+20, Y+54
        Prize: X=16592, Y=14516

        Button A: X+12, Y+22
        Button B: X+38, Y+17
        Prize: X=5624, Y=2372

        Button A: X+28, Y+56
        Button B: X+63, Y+32
        Prize: X=5499, Y=1824

        Button A: X+11, Y+68
        Button B: X+36, Y+17
        Prize: X=1596, Y=2261

        Button A: X+35, Y+16
        Button B: X+12, Y+42
        Prize: X=18101, Y=16340

        Button A: X+86, Y+86
        Button B: X+50, Y+12
        Prize: X=2780, Y=2628

        Button A: X+74, Y+50
        Button B: X+11, Y+63
        Prize: X=1900, Y=6396

        Button A: X+52, Y+67
        Button B: X+97, Y+29
        Prize: X=12679, Y=8370

        Button A: X+24, Y+91
        Button B: X+85, Y+46
        Prize: X=4074, Y=3843

        Button A: X+29, Y+68
        Button B: X+35, Y+13
        Prize: X=12015, Y=1641

        Button A: X+56, Y+18
        Button B: X+21, Y+68
        Prize: X=9601, Y=18358

        Button A: X+84, Y+40
        Button B: X+32, Y+59
        Prize: X=3612, Y=5396

        Button A: X+77, Y+19
        Button B: X+11, Y+92
        Prize: X=3663, Y=8136

        Button A: X+25, Y+38
        Button B: X+38, Y+13
        Prize: X=1657, Y=8142

        Button A: X+13, Y+29
        Button B: X+63, Y+35
        Prize: X=15775, Y=16167

        Button A: X+14, Y+44
        Button B: X+80, Y+24
        Prize: X=7254, Y=4604

        Button A: X+51, Y+34
        Button B: X+26, Y+94
        Prize: X=4065, Y=8230

        Button A: X+14, Y+81
        Button B: X+94, Y+31
        Prize: X=7968, Y=5072

        Button A: X+50, Y+78
        Button B: X+80, Y+26
        Prize: X=5740, Y=3718

        Button A: X+96, Y+73
        Button B: X+18, Y+78
        Prize: X=1728, Y=4401

        Button A: X+19, Y+57
        Button B: X+58, Y+12
        Prize: X=13020, Y=11432

        Button A: X+75, Y+15
        Button B: X+64, Y+86
        Prize: X=11389, Y=7841

        Button A: X+16, Y+50
        Button B: X+33, Y+19
        Prize: X=960, Y=1654

        Button A: X+11, Y+67
        Button B: X+64, Y+12
        Prize: X=7909, Y=5285

        Button A: X+67, Y+89
        Button B: X+90, Y+27
        Prize: X=9541, Y=5825
    """.trimIndent()

}