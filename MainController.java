import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<Review> reviews = new ArrayList<>();

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/reviews")
    public String showReviewsPage(Model model) {
        model.addAttribute("reviews", reviews);
        return "reviews";
    }

    @PostMapping("/addReview")
    public String addReview(@ModelAttribute Review review) {
        reviews.add(review);
        return "redirect:/reviews";
    }

    // Rastgele değerlendirme eklemek için kullanılacak metot
    @GetMapping("/addRandomReviews")
    public String addRandomReviews() {
        reviews.add(new Review("Ahmet", 5, "Mükemmel bir tatildi!"));
        reviews.add(new Review("Ayşe", 4, "Güzel bir deneyim, tekrar gelmek isterim."));
        reviews.add(new Review("Mehmet", 2, "Beklentilerimin altında kaldı."));
        reviews.add(new Review("Elif", 3, "Ortalama bir tatildi."));
        reviews.add(new Review("Fatma", 1, "Hiç memnun kalmadım."));
        return "redirect:/reviews";
    }
}
