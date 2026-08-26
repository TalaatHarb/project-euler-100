use crate::Solvable;

fn sum_of_divisors(n: u64) -> u64 {
    let mut sum = 1u64;
    let mut i = 2u64;
    while i * i <= n {
        if n % i == 0 {
            sum += i;
            if i != n / i { sum += n / i; }
        }
        i += 1;
    }
    sum
}

fn is_amicable(a: u64) -> bool {
    let b = sum_of_divisors(a);
    let c = sum_of_divisors(b);
    a != b && a == c
}

pub struct P021;
impl Solvable for P021 {
    fn problem_name(&self) -> &str { "p021" }
    fn solve(&self) -> i64 {
        (1..=10000u64).filter(|&i| is_amicable(i)).map(|i| i as i64).sum()
    }
}
