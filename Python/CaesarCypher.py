cnt = int(input())
string = input()
shift = int(input())

res = ""

while shift > 26:
    shift -= 26

for char in string:
    if char.isalpha():
        is_upper = False;
        is_lower = False;
        if ord(char) < 95: 
            is_upper = True
        else:
            is_lower = True
        ascii_new = ord(char) + shift

        if is_upper and ascii_new > 90:
            ascii_new = ascii_new - 26

        if is_lower and ascii_new > 122:
            ascii_new = ascii_new - 26

        res += chr(ascii_new)
    else:
        res += char

print(res)
