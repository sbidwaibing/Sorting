# Define the source directories
SRCDIR = .
DRIVERDIR = $(SRCDIR)/driver
IPXDIR = $(SRCDIR)/ipx
LOGICXDIR = $(SRCDIR)/logicx
OPXDIR = $(SRCDIR)/opx

# Define the source files
SOURCES = $(DRIVERDIR)/Driver.java \
          $(IPXDIR)/userInput.java \
          $(LOGICXDIR)/SortLogic.java \
          $(OPXDIR)/consoleOutput.java

# Define the class files (one for each source file)
CLASSES = $(SOURCES:.java=.class)

# Define the target class file (the main class)
MAIN = driver.Driver

# The default target is to compile everything
all: $(CLASSES)

# Rule to compile .java files to .class files
%.class: %.java
	javac $<

# Rule to run the main class
run: all
	java $(MAIN)

# Rule to clean up .class files
clean:
	rm -f $(DRIVERDIR)/*.class $(IPXDIR)/*.class $(LOGICXDIR)/*.class $(OPXDIR)/*.class

# Phony targets
.PHONY: all run clean