compile:
	java -jar antlr-4.7.1-complete.jar -visitor BigCalcProg.g4
	javac -cp antlr-4.7.1-complete.jar:. *.java

run:
	java -cp antlr-4.7.1-complete.jar:. BigCalcProg $(file) 

viz:
	java -cp antlr-4.7.1-complete.jar:. org.antlr.v4.gui.TestRig BigCalcProg expression -gui

clean:
	rm -f *.class
	rm -f 'BigCalcProg.interp'
	rm -f 'BigCalcProg.tokens'
	rm -f 'BigCalcProgBaseListener.java'
	rm -f 'BigCalcProgBaseVisitor.java'
	rm -f 'BigCalcProgLexer.interp'
	rm -f 'BigCalcProgLexer.java'
	rm -f 'BigCalcProgLexer.tokens'
	rm -f 'BigCalcProgListener.java'
	rm -f 'BigCalcProgParser.java'
	rm -f 'BigCalcProgVisitor.java'

