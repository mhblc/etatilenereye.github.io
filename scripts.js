function processPayment() {
    alert('Ödeme işleminiz başarılı!');
    window.location.href = "success.html"; // Başarı sayfasına yönlendirme
    return false; // Sayfanın yeniden yüklenmesini önlemek için
}

function bookNow(location) {
    alert(location + ' için rezervasyon işlemi başlatıldı.');
    window.location.href = "#odeme-sistemi"; // Ödeme kısmına yönlendirme
}

function submitContactForm() {
    alert('Mesajınız gönderildi!');
    return false; // Sayfanın yeniden yüklenmesini önlemek için
}

// Yorum formunu işlemek için yeni işlev
document.getElementById('review-form').addEventListener('submit', function(event) {
    event.preventDefault(); // Formun normal gönderimini engelle
    
    // Başarı mesajını göster
    document.getElementById('review-success').style.display = 'block';
    
    // Form alanlarını temizle
    document.getElementById('review-form').reset();
});
