
grammar_file = open("grammar.txt", "r")

grammar = {}

for line in grammar_file.readlines():
    line = line.split(' => ')
    grammar[line[1].lstrip().rstrip()] = line[0]

prog_file = open("prog.txt", "r")

prog = []
for index, line in enumerate(prog_file.readlines()):
    for key in grammar.keys():
        if line.lstrip().startswith(key):
            line = f'{grammar[key]: <21}: {line.rstrip()}\n'
    prog.append(line)

file = open("translated_prog.txt", "w")
for line in prog:
    file.write(line)
file.close()
