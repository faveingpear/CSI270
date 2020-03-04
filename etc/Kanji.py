class Kanji():
	
	symbol = "";
	reading = "";
	definition = "";
	notes = "";
	
	def getSymbol(self):
		return self.symbol
	
	def getReading(self):
		return self.reading
		
	def getDefinition(self):
		return self.definition
	
	def getNotes(self):
		return self.notes
		
	def setSymbol(self, newSymbol):
		self.symbol = newSymbol
		
	def setReading(self, newReading):
		self.reading = newReading
		
	def setDefinition(self, newDefinition):
		self.definition = newDefinition
		
	def setNotes(self, newNotes):
		self.notes = newNotes
		
	def __init__(self):
		self.notes = "";
		self.symbol = "";
		self.reading = "";
		self.definition = "";

kanjilist = {}

for i in range(2):
	kanjilist[i] = Kanji();

print(kanjilist[0].getSymbol())
