public class ConcreteAgg implements Aggregate{

            String[] tasks  = {"House", "Son", "Three",};

            @Override
            public Interator getInterator() {
                return new TaskInterator();
            }

            private class TaskInterator implements Interator{
                int index = 0;
                @Override
                public boolean hasNext() {
                    if (index < tasks.length) {
                        return true;

                    }
                    return false;
                }

                @Override
                public Object next() {
                    return tasks[index++];
                }

            }



}
