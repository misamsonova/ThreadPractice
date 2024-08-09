package org.example;

public class Comment {


    //8.9 lesson
    /*BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
       new Thread(new Runnable() {
           @Override
           public void run() {
               int i=0;
               while(true) {
                   System.out.println("Counter" + i);
                   i++;
                   Runnable task = null;
                   try {
                       task = blockingQueue.take();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   new Thread(task).start();
               }
           }
       }).start();

       for (int i = 0; i < 10; i++){
           final int index = i;
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           blockingQueue.add(new Runnable() {
               @Override
               public void run() {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println("---" + index);
               }
           });
       }*/

    //8.8 lesson
    /* ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "Mason";
            }
        });

        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(4000);
                return 25;
            }
        });

        try {
            String name = futureName.get();
            int age = futureAge.get();
            System.out.println("\nName: " + name + " Age: " + age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/
}
