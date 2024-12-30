package day24

object Day24Input {

    val testInput = """
x00: 1
x01: 0
x02: 1
x03: 1
x04: 0
y00: 1
y01: 1
y02: 1
y03: 1
y04: 1
ntg XOR fgs -> mjb
y02 OR x01 -> tnw
kwq OR kpj -> z05
x00 OR x03 -> fst
tgd XOR rvg -> z01
vdt OR tnw -> bfw
bfw AND frj -> z10
ffh OR nrd -> bqk
y00 AND y03 -> djm
y03 OR y00 -> psh
bqk OR frj -> z08
tnw OR fst -> frj
gnj AND tgd -> z11
bfw XOR mjb -> z00
x03 OR x00 -> vdt
gnj AND wpb -> z02
x04 AND y00 -> kjc
djm OR pbm -> qhw
nrd AND vdt -> hwm
kjc AND fst -> rvg
y04 OR y02 -> fgs
y01 AND x02 -> pbm
ntg OR kjc -> kwq
psh XOR fgs -> tgd
qhw XOR tgd -> z09
pbm OR djm -> kpj
x03 XOR y03 -> ffh
x00 XOR y04 -> ntg
bfw OR bqk -> z06
nrd XOR fgs -> wpb
frj XOR qhw -> z04
bqk OR frj -> z07
y03 OR x01 -> nrd
hwm AND bqk -> z03
tgd XOR rvg -> z12
tnw OR pbm -> gnj""".trimIndent()

    val prodInput = """
x00: 1
x01: 1
x02: 0
x03: 0
x04: 0
x05: 1
x06: 0
x07: 1
x08: 1
x09: 0
x10: 1
x11: 0
x12: 0
x13: 1
x14: 1
x15: 1
x16: 0
x17: 0
x18: 1
x19: 1
x20: 1
x21: 1
x22: 1
x23: 1
x24: 1
x25: 0
x26: 0
x27: 0
x28: 0
x29: 1
x30: 0
x31: 0
x32: 0
x33: 1
x34: 0
x35: 1
x36: 0
x37: 1
x38: 1
x39: 1
x40: 0
x41: 1
x42: 1
x43: 1
x44: 1
y00: 1
y01: 0
y02: 1
y03: 1
y04: 0
y05: 0
y06: 1
y07: 1
y08: 0
y09: 1
y10: 1
y11: 1
y12: 1
y13: 1
y14: 1
y15: 1
y16: 0
y17: 1
y18: 1
y19: 0
y20: 0
y21: 0
y22: 0
y23: 1
y24: 1
y25: 1
y26: 0
y27: 0
y28: 0
y29: 0
y30: 1
y31: 0
y32: 0
y33: 1
y34: 1
y35: 1
y36: 0
y37: 1
y38: 0
y39: 1
y40: 0
y41: 0
y42: 1
y43: 0
y44: 1
x36 XOR y36 -> sfj
mpq AND dvh -> qgg
sfj XOR fjm -> z36
y10 AND x10 -> pjt
pds XOR wsg -> z25
wjm XOR rhk -> z33
dvd OR kgf -> ckp
tgj XOR mkm -> bjm
x40 AND y40 -> vkd
x28 XOR y28 -> vvc
y22 AND x22 -> tmq
gdw AND tns -> dvd
rwm AND vvc -> cdj
mwg XOR hmm -> z34
dtw AND tgb -> gqg
y20 AND x20 -> pnb
dcn OR qmb -> wsg
hjv OR vwc -> fsw
x26 XOR y26 -> nvr
x41 XOR y41 -> cjs
dwj OR qvk -> z45
x27 XOR y27 -> crd
whv XOR ngt -> z43
rfg AND mwk -> tch
bgt XOR qjc -> skf
frt OR nvr -> bpb
y34 AND x34 -> fnf
y40 XOR x40 -> pmm
sws AND tpq -> hjv
pcn OR vbm -> mwg
mkm AND tgj -> njc
jjb OR vkw -> rhk
fdb XOR smd -> z30
ghh AND gnn -> qhq
ckp AND rds -> spf
dnk AND drk -> tdg
x10 XOR y10 -> rds
wrg OR rtn -> rbk
y19 AND x19 -> kgh
sfj AND fjm -> vnm
tpq XOR sws -> z05
x14 AND y14 -> rmm
qkf AND wkr -> frt
y07 XOR x07 -> tgj
fjf OR bmg -> nbp
fsw XOR nhj -> z06
fvk AND pbn -> gpv
y18 AND x18 -> z18
x21 AND y21 -> vfr
y24 AND x24 -> qmb
vnm OR bkm -> fjq
x27 AND y27 -> qcg
gtk OR cck -> fjm
y22 XOR x22 -> dnk
pnh AND nbp -> gms
vvc XOR rwm -> z28
x38 AND y38 -> shn
wkd OR mbw -> tcb
x01 XOR y01 -> ghh
y26 AND x26 -> wkr
tgm OR skf -> rrq
pth XOR vjb -> z39
x09 AND y09 -> kgf
dkc XOR tjh -> z31
rds XOR ckp -> z10
dvh XOR mpq -> z04
x19 XOR y19 -> scd
bht AND jkm -> qrb
y39 AND x39 -> jmc
x30 AND y30 -> djm
mwg AND hmm -> mhg
tcb XOR jkh -> z44
x37 XOR y37 -> djd
gpv OR jrk -> whv
qgg OR vds -> sws
fwk AND msp -> vbs
y11 AND x11 -> wpw
fnf OR mhg -> bfg
vhb AND bpf -> tst
gpn OR vbs -> gmp
cgh XOR cjs -> z41
x23 AND y23 -> wjw
mwk XOR rfg -> z20
y07 AND x07 -> kbk
x16 AND y16 -> fjf
x37 AND y37 -> gvr
tgv XOR pmm -> z40
y17 XOR x17 -> pnh
x43 XOR y43 -> ngt
njc OR kbk -> z07
y18 XOR x18 -> qjc
y31 XOR x31 -> tjh
tch OR pnb -> swd
x15 XOR y15 -> tgb
x06 XOR y06 -> nhj
tns XOR gdw -> z09
x01 AND y01 -> nck
bpb XOR crd -> z27
bcv AND swd -> djg
bpb AND crd -> hcb
y42 AND x42 -> jrk
fjq AND djd -> fvp
tgv AND pmm -> hfj
x44 XOR y44 -> jkh
gwd XOR sbg -> z11
y23 XOR x23 -> vft
gmp AND rgn -> djp
vft AND hkk -> hqw
y24 XOR x24 -> knh
x30 XOR y30 -> smd
x34 XOR y34 -> hmm
tjh AND dkc -> bkc
rmm OR tst -> dtw
djp OR wwt -> dvh
y25 AND x25 -> kvp
y31 AND x31 -> mqr
fdb AND smd -> sst
x11 XOR y11 -> sbg
x05 AND y05 -> vwc
pds AND wsg -> qsm
scd AND rrq -> bqj
pnh XOR nbp -> z17
scd XOR rrq -> z19
y12 AND x12 -> rtn
btr AND bjm -> bsd
hcb OR qcg -> rwm
y39 XOR x39 -> pth
x12 XOR y12 -> ggj
pmv AND rbk -> z13
y09 XOR x09 -> gdw
vft XOR hkk -> z23
fwv XOR rwk -> z32
wjw OR hqw -> wbw
hcv AND ggj -> wrg
sss OR cmv -> fdb
x08 XOR y08 -> btr
fvp OR gvr -> bht
vhb XOR bpf -> z14
x00 XOR y00 -> z00
tmp AND gph -> cmv
x29 XOR y29 -> tmp
whv AND ngt -> wkd
tgb XOR dtw -> z15
pth AND vjb -> cvf
y33 AND x33 -> vbm
x38 XOR y38 -> jkm
x14 XOR y14 -> vhb
y05 XOR x05 -> tpq
tdg OR tmq -> hkk
bfg AND tdd -> gtk
y03 XOR x03 -> rgn
x04 XOR y04 -> mpq
pmv XOR rbk -> hsw
wjm AND rhk -> pcn
kgh OR bqj -> mwk
spf OR pjt -> gwd
y29 AND x29 -> sss
mqr OR bkc -> fwv
gpt AND fcf -> bmg
y13 AND x13 -> vjf
y32 XOR x32 -> rwk
fvm OR bsd -> tns
y20 XOR x20 -> rfg
bgt AND qjc -> tgm
bht XOR jkm -> z38
gmp XOR rgn -> z03
y15 AND x15 -> bsc
spd OR rmv -> pbn
x04 AND y04 -> vds
y06 AND x06 -> cbn
fjq XOR djd -> z37
x41 AND y41 -> rmv
swd XOR bcv -> z21
tcb AND jkh -> qvk
dvw OR cbn -> mkm
ghh XOR gnn -> z01
x00 AND y00 -> gnn
jct OR gms -> bgt
x03 AND y03 -> wwt
y08 AND x08 -> fvm
wpw OR pnq -> hcv
nck OR qhq -> msp
wbw XOR knh -> z24
qkf XOR wkr -> z26
y16 XOR x16 -> fcf
cvf OR jmc -> tgv
rwk AND fwv -> vkw
y43 AND x43 -> mbw
tmp XOR gph -> z29
y35 AND x35 -> cck
knh AND wbw -> dcn
y36 AND x36 -> bkm
hcv XOR ggj -> z12
tvw OR cdj -> gph
fcf XOR gpt -> z16
msp XOR fwk -> z02
y25 XOR x25 -> pds
qrb OR shn -> vjb
vjf OR hsw -> bpf
x44 AND y44 -> dwj
x21 XOR y21 -> bcv
y42 XOR x42 -> fvk
cgh AND cjs -> spd
dnk XOR drk -> z22
sst OR djm -> dkc
bfg XOR tdd -> z35
btr XOR bjm -> z08
djg OR vfr -> drk
bsc OR gqg -> gpt
fvk XOR pbn -> z42
hfj OR vkd -> cgh
gwd AND sbg -> pnq
x32 AND y32 -> jjb
kvp OR qsm -> qkf
x17 AND y17 -> jct
y02 XOR x02 -> fwk
y33 XOR x33 -> wjm
x13 XOR y13 -> pmv
y28 AND x28 -> tvw
fsw AND nhj -> dvw
x02 AND y02 -> gpn
x35 XOR y35 -> tdd""".trimIndent()

}