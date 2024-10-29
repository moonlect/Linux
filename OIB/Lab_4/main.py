def pad(text):
    while len(text) % 16 != 0:
        text += ' '
    return text

def encrypt(plaintext, key):
    plaintext = pad(plaintext)
    key = pad(key)
    ciphertext = []

    for i in range(0, len(plaintext), 16):
        block = [ord(c) for c in plaintext[i:i+16]]
        key_block = [ord(c) for c in key[:16]]
        encrypted_block = [block[j] ^ key_block[j] for j in range(16)]
        ciphertext.extend(encrypted_block)

    return ''.join([chr(c) for c in ciphertext])

def decrypt(ciphertext, key):
    key = pad(key)
    decrypted_text = []

    for i in range(0, len(ciphertext), 16):
        block = [ord(c) for c in ciphertext[i:i+16]]
        key_block = [ord(c) for c in key[:16]]
        decrypted_block = [block[j] ^ key_block[j] for j in range(16)]
        decrypted_text.extend(decrypted_block)

    return ''.join([chr(c) for c in decrypted_text]).strip()

plaintext = input("Введите открытый текст: ")
key = input("Введите ключ (до 16 символов): ")

encrypted_text = encrypt(plaintext, key)
print(f"Зашифрованный текст: {encrypted_text}")

decrypted_text = decrypt(encrypted_text, key)
print(f"Расшифрованный текст: {decrypted_text}")
