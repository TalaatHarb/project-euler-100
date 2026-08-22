use crate::{Runable, Solvable};
use std::collections::HashMap;

fn number_as_letters(n: i64, words: &mut HashMap<i64, String>) -> String {
    let base: HashMap<i64, &str> = [
        (1,"one"),(2,"two"),(3,"three"),(4,"four"),(5,"five"),
        (6,"six"),(7,"seven"),(8,"eight"),(9,"nine"),(10,"ten"),
        (11,"eleven"),(12,"twelve"),(13,"thirteen"),(14,"fourteen"),(15,"fifteen"),
        (16,"sixteen"),(17,"seventeen"),(18,"eighteen"),(19,"nineteen"),
        (20,"twenty"),(30,"thirty"),(40,"forty"),(50,"fifty"),
        (60,"sixty"),(70,"seventy"),(80,"eighty"),(90,"ninety"),
        (1000,"one thousand"),
    ].iter().cloned().collect();

    if let Some(s) = base.get(&n) { return s.to_string(); }
    if let Some(s) = words.get(&n) { return s.clone(); }

    let result = if n < 100 {
        let tens = (n / 10) * 10;
        let ones = n % 10;
        format!("{}-{}", base[&tens], base[&ones])
    } else if n < 1000 {
        let hundreds = n / 100;
        let rest = n % 100;
        if rest == 0 {
            format!("{} hundred", base[&hundreds])
        } else {
            format!("{} hundred and {}", base[&hundreds], number_as_letters(rest, words))
        }
    } else {
        String::new()
    };
    words.insert(n, result.clone());
    result
}

fn letter_count(s: &str) -> usize {
    s.chars().filter(|c| c.is_alphabetic()).count()
}

pub struct P017;
impl Solvable for P017 {
    fn problem_name(&self) -> &str { "p017" }
    fn solve(&self) -> i64 {
        let mut words = HashMap::new();
        (1..=1000).map(|i| letter_count(&number_as_letters(i, &mut words)) as i64).sum()
    }
}
impl Runable for P017 {}
