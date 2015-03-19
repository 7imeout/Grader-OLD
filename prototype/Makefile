build:
	@mkdir -p bin
	@javac -d bin src/*.java
	@jar -cef GraderAppMain grader.jar -C bin .

clean:
	@rm -rf bin