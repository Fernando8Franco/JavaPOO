package javapoo06;

public class Exercise06 {
    public static void main(String[] args) {
        CoffeMakerService cms = new CoffeMakerService();
        CoffeMaker cm = cms.make_coffe_maker();

        cms.fill_coffe_maker(cm);
        cms.serve_cup(cm);
        cms.serve_cup(cm);
        cms.add_coffe(cm);
        cms.show(cm);
    }
}
