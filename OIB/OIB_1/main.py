class CaesarCipher:
    def __init__(self, shift):
        self.shift = shift
        self.alphabet = 'АБВГДЕЁЖЗИЙКЛМНОПРСТУФ1ХЦЧШЩЪЫЬЭЮЯ '
        self.alphabet_size = len(self.alphabet)

    def encrypt(self, text):
        encrypted_text = ''
        for char in text.upper():
            if char in self.alphabet:
                new_index = (self.alphabet.index(char) + self.shift) % self.alphabet_size
                encrypted_text += self.alphabet[new_index]
            else:
                encrypted_text += char
        return encrypted_text

    def decrypt(self, text):
        decrypted_text = ''
        for char in text.upper():
            if char in self.alphabet:
                new_index = (self.alphabet.index(char) - self.shift) % self.alphabet_size
                decrypted_text += self.alphabet[new_index]
            else:
                decrypted_text += char
        return decrypted_text

def main():
    while True:
        mode = input("Выберите режим (шифрование - 1 /дешифрование - 2): ").strip().lower()

        if mode != '1' and mode != '2':
            print("Неверный режим. Пожалуйста, выберите 'шифрование - 1' или 'дешифрование - 2'.")
            continue

        shift = int(input("Введите сдвиг: "))
        text = input("Введите текст: ")

        cipher = CaesarCipher(shift)

        if mode == '1':
            result = cipher.encrypt(text)
        elif mode == '2':
            result = cipher.decrypt(text)

        print(f'Результат: {result}')


if __name__ == "__main__":
    main()
