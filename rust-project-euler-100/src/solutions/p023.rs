use crate::{Runable, Solvable};

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

pub struct P023;
impl Solvable for P023 {
    fn problem_name(&self) -> &str { "p023" }
    fn solve(&self) -> i64 {
        let limit = 28_123usize;
        let abundant: Vec<usize> = (1..=limit)
            .filter(|&i| sum_of_divisors(i as u64) > i as u64)
            .collect();

        let mut sum_of_two = vec![false; limit + 1];
        for &a in &abundant {
            for &b in &abundant {
                let s = a + b;
                if s <= limit { sum_of_two[s] = true; } else { break; }
            }
        }

        (0..=limit).filter(|&i| !sum_of_two[i]).map(|i| i as i64).sum()
    }
}
impl Runable for P023 {}
