from tkinter import *

def btn(numbers):
    global operator
    operator = operator + str(numbers)
    txt_input.set(operator)

def Clear():
    global operator
    operator = ''
    txt_input.set('')
    Display.insert(0,'')

def Equal():
    global operator
    sumup = float(eval(operator))
    txt_input.set(sumup)
    operator = ''

root = Tk()  #Tk() creates the window and stored inside the root variable
#root.geometry('300x300') dimension of the window
root.title("Calculator") #To change the title of the window

operator = ''
txt_input = StringVar(value='Start Calculating..')
#----------------SCREEN----------------
Display = Entry(root,font=('arial',30,'bold'),fg='white',bg='green',justify='right',bd=50,textvariable=txt_input)
Display.grid(columnspan=4)

#---------------ROW1--------------------
btn7 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='7',command=lambda:btn(7)).grid(row=1,column=0)
btn8 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='8',command=lambda:btn(8)).grid(row=1,column=1)
btn9 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='9',command=lambda:btn(9)).grid(row=1,column=2)
btnC = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='C',bg='green',command=Clear).grid(row=1,column=3)

#----------------ROW2-------------------
btn4 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='4',command=lambda:btn(4)).grid(row=2,column=0)
btn5 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='5',command=lambda:btn(5)).grid(row=2,column=1)
btn6 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='6',command=lambda:btn(6)).grid(row=2,column=2)
btnplus = Button(root,padx=33,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='+',bg='orange',command=lambda:btn('+')).grid(row=2,column=3)

#----------------ROW3-------------------
btn1 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='1',command=lambda:btn(1)).grid(row=3,column=0)
btn2 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='2',command=lambda:btn(2)).grid(row=3,column=1)
btn3 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='3',command=lambda:btn(3)).grid(row=3,column=2)
btnminus = Button(root,padx=38,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='-',bg='orange',command=lambda:btn('-')).grid(row=3,column=3)

#----------------ROW4-------------------
btn0 = Button(root,padx=30,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='0',command=lambda:btn(0)).grid(row=4,column=0)
btndot = Button(root,padx=35,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='.',bg='orange',command=lambda:btn('.')).grid(row=4,column=1)
btndivision = Button(root,padx=35,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='/',bg='orange',command=lambda:btn('/')).grid(row=4,column=2)
btnmultiply = Button(root,padx=38,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='*',bg='orange',command=lambda:btn('*')).grid(row=4,column=3)

#----------------ROW5-------------------
btnequal = Button(root,padx=95,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='=',bg='green',command=Equal).grid(row=5,column=0,columnspan=2)
btnopenbrac = Button(root,padx=35,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text='(',bg='orange',command=lambda:btn('(')).grid(row=5,column=2)
btnclosebrac = Button(root,padx=39,pady=10,bd=8,fg='black',font=('arial',30,'bold'),
                text=')',bg='orange',command=lambda:btn(')')).grid(row=5,column=3)


root.mainloop() #to make sure window stays and doesn't dissappear
