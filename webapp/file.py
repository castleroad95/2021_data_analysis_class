todos=open('todos.txt','a')

print('put out the trash',file=todos)
print('feed the cat.',file=todos)

todos.close()