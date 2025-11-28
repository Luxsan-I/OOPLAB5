@Test
2 public void testInsertionPerformance() {
3 long startTime = System.nanoTime();
4 for (int i = 0; i < 10000; i++) {
5 list.add(i);
6 }
7 long endTime = System.nanoTime();
8 long duration = endTime - startTime;
9 System.out.println("Insertion time: " + duration + " ns");
10 }
