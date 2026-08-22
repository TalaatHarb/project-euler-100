use crate::{Runable, Solvable};

fn nth_permutation(n: usize, digits: &str) -> String {
    let mut n = n - 1; // 0-indexed
    let mut chars: Vec<char> = digits.chars().collect();
    let mut result = String::new();
    let len = chars.len();
    let mut factoradic = Vec::new();
    for i in 1..=len {
        factoradic.push(n % i);
        n /= i;
    }
    for idx in factoradic.iter().rev() {
        result.push(chars[*idx]);
        chars.remove(*idx);
    }
    result
}

pub struct P024;
impl Solvable for P024 {
    fn problem_name(&self) -> &str { "p024" }
    fn solve(&self) -> i64 {
        nth_permutation(1_000_000, "0123456789").parse().unwrap()
    }
}
impl Runable for P024 {}
