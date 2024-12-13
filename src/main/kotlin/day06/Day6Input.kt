package day06



val mapInput = """
.....................#................#...#.....#.................................................#...........#...................
.............#....#.#.................................#....................................................#.........#............
...........................................#...................................................................#......#...........
....................................................#................#.......#.............#......................................
..........................................#...##.#....................................#....#.........#............................
....................................#.............................................#.......#................#.......###............
..##.......#......................#..#........................................................#...................#...............
.....#...........#..................................#..............#...........#..................................................
..........#..#......#.....#..#........#..................#.............................#...........................##............#
..............................#....#..........#...................................................................................
.......#.#..........................#.........#...##..........................................................#.#....#...#.#......
..............................................................................................................#.........#.........
....................#......#.....#...............................#..#.........#........................#.#.....#..................
......................................##.................#.....................#............#.#.#..............#...............#..
#...........................#..................#.....#..#..#.............#......#.........#........#........#.#.#.................
.......#.............#....................#.................#...#.........#.......#................#......#................#....#.
...............#.................................................#................#..................#..................#.........
.........#....................#..............................#..............#..............#.......#....................#......#..
....................................##.............................................................................#.#............
.....................................................................#...#.#........................#....#....#......#............
.....#...........................#.........#.............................................................................#........
...............#.#.........#...............##..............................................#............#.........................
#..............#....##....#............#...#.#............................#...................................#..#..............#.
........#.........#...........................................................#..............................................#....
.........................................................................................#.......#................................
................................#.........#..........#..#.......................................#..............................#..
........................#.................................................................................##........#.............
.....#.....................#.....................#...#...........#.........................#......................................
....................................................................................................#.............................
.........#...................................#...#................................................................................
..............#............##......#..............#......................................................#.....................#..
..#.......#............................................................................#...#.....................#................
..................#.....................##..#.................#..........#.....#........#.............#............#...........#..
...................................#.....#..............#..#.............................................#.....#......#....#......
......#....#.....................................................#................#...............................#...............
..#.#..................#.......#......#.............#.......#.....................................................................
......##...........................#.................#.....#........................................#.............................
...#......................#...............##......#.......................#..........#.................#.......#.......#..........
...........................#.............................................................#.#................#......#..#...........
..#.............#.....#.........................................................#..........#......................................
...........#.........#..........................................................................#..............#..................
.#.......................................................#.#.......#............................................#.#...............
..........................#....#...............#............................................................#.........#...........
.........................##.........#^.....................................................#......................................
........#.......#.................................................................................................#.......#.......
..........#..................................##..#.......................#.................#....................................#.
...................................#..#.....#.#.............#.....#.................##..............#.............................
...........................................................#.........................................................#......#.....
............#.........................#.........#.................................................................................
................#.........................#...............................#.......................................................
.....................#.......#.................#.#..............#...............#.................................................
...#......................#...............................#.......#.......#..........................................#............
.........#..#............................................................................................#........................
..............................................................................................#.#...........#.........#...........
..#..............#...............#.................................................................#.....#........................
................#..........#.......##..............#..............................#.##......#.....................................
.........#....#.#..................................................................#...................#..........................
#...#............#...............................................................................................................#
........#.....#.#................#.........................#.........#...........................##........................#.#....
......#...#.....................................................................#...........................#.....................
........#.........#.....................#............................................................................#..........#.
.................................................................#....................#.........#..#...#.##.......................
..........#...........................##.......#...................................................................#.#............
.......................................................................................#.................#..#.#...................
............................................................................................#.............#.......................
........................#........................#.................#..........................#...........................#.......
.....................................#......#.................................#..........#........................................
....#...............................#........#............................#............................#..........................
..........#................#.#....................................................................................................
#........................................................................#..........................................#.....#.......
.#....................................#.........#..#.#...................................................#........................
...................#....................#..............#..................#.................................................#.....
.........................................................................#..........................#............#................
........................................................#.................................................................#.......
#...........................................#..............#............................................................#..#......
...............#..............#...............#............................#.......#.............#....#...........................
......#............#.#...........................................................................................#................
..................#..#.......#..............................#.............................#........#.......#.........#...........#
...............#.....................................#......#....................................#..........#................#....
.............................................#...............#...........#........#.............#...#.......................##....
.....#..................#...........#..............#.............#....................................#.........#.................
........................#.......................................................................#...........#.....................
.............................#.....................................................#........##....................................
...........#.................................................................................#.........#....#....#.....#..........
.....#..................................................................................#.....#.............................#....#
..#........#...............#.........................................................#.......#........................#.........#.
..............................................#....................##..............................#..........#.......#.#......#..
.......................#......................................................#........#..........................................
..#.........................................#...........#.........................................................#...............
..........................#.......#...............................................................................................
.........#.....................#..............................................#...............#...................................
..............................................#.........#..........#....#..............#..........................................
......................................#.........#............#........................................................#...#.......
...........................................#.....#..................#.....#..........#...............#...#........................
.......................#........#..........................................................#.......#.........#............#....#..
..........#.....................................................................#...#.......#.......#.........#.....#.............
.............................#..#...............................#....#.................................................#..#.......
.#.............#................##......................................#...#..............................#............#.........
....#.........#....#..................................................................................#...............#.....#.....
......#................................................#.....#.#.......#.......#....................#.............#...............
...............................#..........#........................#.......................................................#.....#
...............#.......................................................................................#......#.......#..#.#.#....
..#....#.........................................................................#...................#....................##......
...........................#......#.................#...#..........................#..............................................
......#..........#...#............#....#..........................................................................................
.......................#......#...............#..#......................#......#........................#........................#
.#............#................................#............#....................#.................................#..............
................#.........#.................###............#..#...............#..............................#...#................
......#..........................#....#............#.................#...................................................#........
..........................#...#.............#........#......................#......................#.#.............#............#.
............................#................#....................#....##.......................#........#..........##.....#......
..............#.#...................#.#.............................................#..........#......#...........................
.....#.........................#...........#...#......................................#......#..........#.#....#.##...............
.............##.##....................................................................#.#..............#.......#.....#..#...#.....
#.......#..................#.........#...................#................#..##...............##...............#..................
..............#....#........#.....#.................................#....#....#...#.......................................#.......
...........................#......#..............................#......................#.........................................
.................#.#..........##................#...#..................................#..............#.....#.................#...
..........................#..............#..#......................#.......................#...........##.........................
..#...................#..........#.......#..........#...............................#.....................#.......................
............#......................#................#....#......................#.................................................
...........................................#........#.........#..........#..................#....#.........#....##................
..........#........................#.#...............#............................................#........#...#.....#............
...............#..........#..........#...#.....#........................#..............#..#.....................##................
...#.......................##.....................#................................................#..#............#..............
....#........#..#...#.#............................#................#................#............................................
...........#....................#.....#.........................#....................#.............#....#.........#...#........##.
.#.....#.................##............#...............................#...............#.......................##.................
..............................#................................#.............................#................#.#.................
............##..............#........#.......#...................#..........................#.............###..#...#............#.
""".trimIndent()