package course;

import command.ReadCommand;
import command.WriteCommand;
import util.GraderData;

public abstract class CourseSnapshot extends Course {
   public abstract <T extends GraderData> T read(ReadCommand<T> command);
   public abstract void write(WriteCommand command);
}
